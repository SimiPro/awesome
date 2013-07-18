package com.simi.awesome.schema.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Field {

	@XmlElements(value = { //
			@XmlElement(name = "Constant", type = String.class), //
			@XmlElement(name = "DatasourceField", type = DatasourceField.class),
			@XmlElement(name = "ScriptValue", type = ScriptValue.class) })
	private Object dataSource;

}
