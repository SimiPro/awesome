package com.simi.awesome;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.simi.awesome.schema.common.DetailGroup;
import com.simi.awesome.schema.common.Field;
import com.simi.awesome.schema.common.Gui;

@RunWith(JUnit4.class)
public class GuiDetailGroupTest {

	@Before
	public void setUp() {

	}

	@Test
	public void test() {
		Gui gui = new Gui();
		// gui.setBaseEntity("test");
		DetailGroup detailGroup = new DetailGroup();
		detailGroup.setBaseEntity("test");
		Field field = new Field();
		// field.setDataSourceField(new DatasourceField());
		detailGroup.getField().add(field);
		// gui.getGroup().add(detailGroup);
	}

}
