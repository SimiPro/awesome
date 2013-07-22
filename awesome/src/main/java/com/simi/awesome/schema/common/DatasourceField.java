package com.simi.awesome.schema.common;

public class DatasourceField implements Value {

	private String datasourceField;

	@Override
	public String getValue() {
		return datasourceField;
	}

	public String getDatasourceField() {
		return datasourceField;
	}

	public void setDatasourceField(String datasourceField) {
		this.datasourceField = datasourceField;
	}

}
