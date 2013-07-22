package com.simi.awesome.schema.common;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(DatasourceValueAdapter.class)
public interface Value {

	String getValue();

}
