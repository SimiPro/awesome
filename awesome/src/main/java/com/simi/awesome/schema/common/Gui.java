package com.simi.awesome.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "##default")
public class Gui {

	List<DetailGroup> detailGroup;

	public Gui() {
		setGroup(new ArrayList<DetailGroup>());
	}

	public List<DetailGroup> getGroup() {
		return detailGroup;
	}

	public void setGroup(List<DetailGroup> group) {
		this.detailGroup = group;
	}

}
