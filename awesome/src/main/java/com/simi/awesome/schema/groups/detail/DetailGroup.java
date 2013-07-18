package com.simi.awesome.schema.groups.detail;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.simi.awesome.schema.common.Field;
import com.simi.awesome.schema.common.Group;

@XmlRootElement
public class DetailGroup implements Group {

	List<Field> fields;

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

}