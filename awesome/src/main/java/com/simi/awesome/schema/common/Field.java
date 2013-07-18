package com.simi.awesome.schema.common;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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
