package com.simi.awesome.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "##default")
public class Gui {

	List<DetailGroup> detailGroup;

	public Gui() {
		setGroups(new ArrayList<DetailGroup>());
	}

	public List<DetailGroup> getGroups() {
		return detailGroup;
	}

	public void setGroups(List<DetailGroup> groups) {
		this.detailGroup = groups;
	}

}
