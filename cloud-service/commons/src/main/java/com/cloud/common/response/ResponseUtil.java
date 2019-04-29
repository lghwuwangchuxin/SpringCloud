package com.cloud.common.response;

/**
 * 
 * @author lgh
 *
 */
public class ResponseUtil {
	/**
	 * 操作成
	 * @param code
	 * @param msg
	 * @param data
	 * @return
	 */
	public static <T> Result<T> ok(T data) {
		Result<T> res = new Result<>();
		Integer code = ResultEnumCode.SUCCESS.getCode();
		String name = ResultEnumCode.getName(code);
		res.setCode(code);
		res.setMsg(name);
		res.setData(data);
		return res;
	}
	/**
	 * 操作失败
	 * @param data
	 * @return
	 */
	public static <T> Result<T> fall(T data) {
		Result<T> res = new Result<>();
		Integer code = ResultEnumCode.FAIL.getCode();
		String name = ResultEnumCode.getName(code);
		res.setCode(code);
		res.setMsg(name);
		res.setData(data);
		return res;
	}
	
	/**
	 * 操作错误异常
	 * @param code
	 * @param msg
	 * @param data
	 * @return
	 */
	public static <T> Result<T> error(Integer code, String msg, T data) {
		Result<T> res = new Result<>();
		res.setCode(code);
		res.setMsg(msg);
		res.setData(data);
		return res;
	}
	/**
	 * 系统级异常
	 * @param code
	 * @param msg
	 * @param data
	 * @return
	 */
	public static <T> Result<T> exception(Integer code, String msg, T data) {
		Result<T> res = new Result<>();
		res.setCode(code);
		res.setMsg(msg);
		res.setData(data);
		return res;
	}
	 
}
