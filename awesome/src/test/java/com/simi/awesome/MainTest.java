package com.simi.awesome;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xml.sax.SAXException;

import com.simi.awesome.schema.common.Gui;

@RunWith(JUnit4.class)
public class MainTest {

	@Test
	public void testRender() throws SAXException, JAXBException, IOException {
		// Gui unmarshal2 = JaxbMarshalUnmarshalUtil.unmarschalSchemaUrl(
		// "https://raw.github.com/SimiPro/awesome/master/awesome/src/main/resources/schema1.xsd",
		// "detail-gui.xml", Gui.class);
		InputStream stream = getClass().getResourceAsStream("detail_gui.xml");
		JAXBContext context = JAXBContext.newInstance(Gui.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		// this implementation is a part of the API and convenient for
		// trouble-shooting,
		// as it prints out errors to System.out
		unmarshaller.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());
		Gui gui = (Gui) unmarshaller.unmarshal(stream);

		System.err.println(gui);
	}
}
