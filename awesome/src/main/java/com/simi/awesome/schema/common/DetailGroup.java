package com.simi.awesome.schema.common;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class DetailGroup {

	List<Field> field;

	public List<Field> getField() {
		return field;
	}

	public void setField(List<Field> field) {
		this.field = field;
	}

}
