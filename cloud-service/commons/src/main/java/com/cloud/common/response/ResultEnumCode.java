package com.cloud.common.response;

public enum ResultEnumCode {
	
	SUCCESS(200,"操作成功"), 
	FAIL(400,"操作失败"), 
	UNAUTHORIZED(401,"未经授权"), 
	NOT_FOUND(404,"未发现"),
	INTERNAL_SERVER_ERROR(500,"系统异常"),
	//AOP拦截
	ERROR_METHOD_NAME(6000,"方法名错误"),
	ERROR_PARAM_IS_NULL(6001,"参数不能为空"),
	//Token拦截
	ERROR_NO_LOGIN     (7000,"未登陆状态"),	 
	ERROR_TOKEN_EXPIRE (7001,"Token过期"),
	ERROR_TOKEN_FAIL   (7002,"Token验证失败"),
	ERROR_TOKEN_NO_USER(7003,"无效信息，无法生成Token"),
	ERROR_NO_EQUIPMENT (9000,"无权限"),
	//---fen
	ERROR_OUT_INTERFACE(8000,"无效方法名"),
	//---
	LOGS_NO_CODE  (9000,"没有找到日志code"),
	LOGS_NOT_CODE (9001,"无效日志code")
	
	;
	private  Integer code;
	private  String name;

	ResultEnumCode(Integer code, String name) {
		this.code = code;
		this.name = name;
	}
	//cold对应的中文
    public static String getName(Integer code) {
        for (ResultEnumCode c : ResultEnumCode.values()) {
            if (c.getCode().equals(code)) {
                return c.name;
            }
        }
        return null;
    }

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 

}
