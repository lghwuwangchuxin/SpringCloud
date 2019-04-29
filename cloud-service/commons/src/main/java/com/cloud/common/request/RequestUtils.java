package com.cloud.common.request;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RequestUtils {
	
	/**
     * 如果客户端通过 request 传递数据，那么就可以使用该方法获取数据
     * 这种通常是通过 Post方式
     * @param request HttpServletRequest
     * @return 客户端上传的数据
     * @throws IOException 因为是通过IO流读取数据，
     *         因此很可能读取失败，或者NULL，导致抛出IO异常，
     */
    public static String getPostData(HttpServletRequest request){
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return URLDecoder.decode(sb.toString(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
    
    public static String getPayData(HttpServletRequest req) {
		ServletInputStream is;
		try {
			is = req.getInputStream();
			int nRead = 1;
			int nTotalRead = 0;
			byte[] bytes = new byte[10240];
			while (nRead > 0) {
				nRead = is.read(bytes, nTotalRead, bytes.length - nTotalRead);
				if (nRead > 0) nTotalRead = nTotalRead + nRead;
			}
			String str = new String(bytes, 0, nTotalRead, "utf-8");
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
    
    /**
     * 获取FormData数据
     * @param req
     * @return
     */
    @SuppressWarnings("unchecked")
	public static Map<String, Object> getFormData(HttpServletRequest req) {
		Map<String, String[]> parameterMap = req.getParameterMap();
		Set<Entry<String, String[]>> entrySet = parameterMap.entrySet();
		Map<String, Object> parMap = new LinkedHashMap<>();
		for (Entry<String, String[]> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue()[0];
			if (key!=null && key.indexOf("[")>=0) {
				String rKey =key.replace("[", "@").replace("]", "");
				String objName = rKey.split("@")[0];
				String valName = rKey.split("@")[1];
				if (parMap.get(objName)==null) {
					Map<String, Object> objMap = new HashMap<>();
					objMap.put(valName, value);
					parMap.put(objName, objMap);
				}else {
					Map<String, Object> objMap = (Map<String, Object>)parMap.get(objName);
					objMap.put(valName, value);
				}
			}else {
				parMap.put(key, value);
			}
		}
		return parMap;
	}

}
