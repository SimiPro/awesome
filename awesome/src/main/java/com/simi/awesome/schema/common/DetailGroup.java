package com.simi.awesome.schema.common;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class DetailGroup implements Group {

	List<Field> field;

	public List<Field> getFields() {
		return field;
	}

	public void setFields(List<Field> fields) {
		this.field = fields;
	}

}
