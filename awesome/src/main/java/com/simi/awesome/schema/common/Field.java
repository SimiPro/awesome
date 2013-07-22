package com.simi.awesome.schema.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Field {

	@XmlJavaTypeAdapter(ValueToInterfaceAdapter.class)
	@XmlElements(value = { //
			@XmlElement(name = "Constant", type = Constant.class), //
			@XmlElement(name = "DatasourceField", type = DatasourceField.class),
			@XmlElement(name = "ScriptValue", type = ScriptValue.class) })
	private Value dataSource;

}
