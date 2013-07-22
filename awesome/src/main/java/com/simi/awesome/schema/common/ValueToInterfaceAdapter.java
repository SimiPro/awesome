package com.simi.awesome.schema.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ValueToInterfaceAdapter extends XmlAdapter<Object, Value> {

	@Override
	public Value unmarshal(Object v) throws Exception {
		if (v instanceof String) {
			ConstantValue value = new ConstantValue();
			value.setConstant((String) v);
			return value;
		}
		return (Value) v;
	}

	@Override
	public Object marshal(Value v) throws Exception {
		return v;
	}

}
