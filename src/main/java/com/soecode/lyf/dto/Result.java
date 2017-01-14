package com.soecode.lyf.dto;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> {

	private int code;// 是否成功标志

	private T data;// 成功时返回的数据

	private String msg;// 返回信息

	public Result() {
	}

	public Result(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Result(int code, T data) {
		this.code = code;
		this.data = data;
	}

	public Result(int code, T data, String msg) {
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Result{" +
				"code=" + code +
				", data=" + data +
				", msg='" + msg + '\'' +
				'}';
	}
}
