package com.cws.vo;

import java.util.HashMap;

public class JsonBean extends HashMap<Object, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		put("code", code);
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		 put("message", message);
		this.message = message;
	}

	public void put(String key, Object value) {
		super.put(key, value);
	}
}
