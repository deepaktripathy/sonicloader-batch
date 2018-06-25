package com.sonicloader.rest.domain;

public class Welcome {

	public Welcome(String message) {
		super();
		this.message = message;
	}

	private final String message;

	public String getMessage() {
		return message;
	}

}
