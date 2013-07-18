package com.simi.awesome.schema.common;


public class Field {

	private enum FieldSource {
		ConstantValue;
	}

	private FieldSource dataSource;

	public FieldSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(FieldSource dataSource) {
		this.dataSource = dataSource;
	}

}
