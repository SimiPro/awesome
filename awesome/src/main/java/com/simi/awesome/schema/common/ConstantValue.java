package com.simi.awesome.schema.common;

public class ConstantValue implements Value {

	private String constant;

	public void setConstant(String constant) {
		this.constant = constant;
	}

	@Override
	public String getValue() {
		return constant;
	}

}
