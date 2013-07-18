package com.simi.awesome.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.simi.awesome.schema.groups.detail.DetailGroup;

@XmlRootElement
public class Gui {

	List<DetailGroup> groups;

	public Gui() {
		setGroups(new ArrayList<DetailGroup>());
	}

	public List<DetailGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<DetailGroup> groups) {
		this.groups = groups;
	}

}
