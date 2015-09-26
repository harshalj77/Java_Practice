package com.cloudwick.java.xml;

import java.util.ArrayList;
import java.util.List;

public class PersonXml {
	private List<EmployeeXml> emplist = new ArrayList<>();

	public List<EmployeeXml> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<EmployeeXml> emplist) {
		this.emplist = emplist;
	}

}
