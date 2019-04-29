package com.cloud.common.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.cloud.common.request.RequestUtils;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author lgh
 *
 * @param <T> 自定义查询类
 */
public class PageUtils<T> {
	
	@ApiModelProperty(value = "接收分页查询的JSON数据格式，前端与后台开发协商")
	private T queryColumn;
	
	private Integer pageNum = 1;
	
	private Integer pageSize = 10;
	
	public Map<String, Object> getResultMap(List<?> content, Long total) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("page", pageNum);
		resultMap.put("pageSize", pageSize);
		resultMap.put("rows", content);
		resultMap.put("total", total);
		return resultMap;
	}
	
	public PageUtils() {
		super();
	}
	
	@SuppressWarnings("unchecked")
	public PageUtils(Class<T> obj, HttpServletRequest req) {
		Map<String, Object> formData = RequestUtils.getFormData(req);
		Map<String, Object> queryMap = (Map<String, Object>)formData.get("queryColumn");
    	if(formData.get("pageNum")!=null) this.setPageNum(Integer.valueOf(formData.get("pageNum").toString()));
    	if(formData.get("pageSize")!=null) this.setPageSize(Integer.valueOf(formData.get("pageSize").toString()));
		this.setQueryColumn(JSON.parseObject(JSON.toJSONString(queryMap),obj));
	}

	public T getQueryColumn() {
		return queryColumn;
	}

	public void setQueryColumn(T queryColumn) {
		this.queryColumn = queryColumn;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public void putData(Class<T> obj, HttpServletRequest req) {
		String payData = RequestUtils.getPayData(req);
    	this.setPageNum(Integer.valueOf(JSON.parseObject(payData).get("pageNum").toString()));
    	this.setPageSize(Integer.valueOf(JSON.parseObject(payData).get("pageSize").toString()));
		this.setQueryColumn(JSON.parseObject(JSON.parseObject(payData).get("queryColumn").toString(),obj));
    }
	
}
