package com.simi.awesome.schema.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DatasourceValueAdapter extends XmlAdapter<DatasourceValue, Value> implements Value {

	@Override
	public Value unmarshal(DatasourceValue v) throws Exception {
		return v;
	}

	@Override
	public DatasourceValue marshal(Value v) throws Exception {
		return (DatasourceValue) v;
	}

	@Override
	public String getValue() {
		return null;
	}
}