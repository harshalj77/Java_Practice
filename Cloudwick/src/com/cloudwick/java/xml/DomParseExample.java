package com.cloudwick.java.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParseExample {

	static Document doc;
	static PersonXml pobj;

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {
		// TODO Auto-generated method stub

		parseXml();
		parseDocument();

	}

	private static void parseXml() throws ParserConfigurationException,
			SAXException, IOException {
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		DocumentBuilder dom = fac.newDocumentBuilder();
		doc = dom.parse("Person.xml");
	}

	private static void parseDocument() {
		// Reading root tag parameter
		Element rootEl = doc.getDocumentElement();

		// Fetching Employee tags List
		NodeList empList = rootEl.getElementsByTagName("Employee");

		pobj = new PersonXml();

		// Loop through each employee
		for (int i = 0; i < empList.getLength(); i++) {
			Element empEl = (Element) empList.item(i);
			EmployeeXml obj = new EmployeeXml();
			obj.setId(Integer.parseInt(empEl.getAttribute("id")));

			// Fetching name tag element
			Element nameEl = (Element) empEl.getElementsByTagName("name").item(
					0);
			String name = nameEl.getFirstChild().getNodeValue();
			obj.setName(name);

			Element ageEl = (Element) empEl.getElementsByTagName("age").item(0);
			String age = ageEl.getFirstChild().getNodeValue();
			obj.setName(age);
			
			pobj.getEmplist().add(obj);

		}
	}
	
	public static void printDate(){
          for(EmployeeXml emp:pobj.getEmplist()){
        	  
        	    System.out.println(emp.getId());
      			System.out.println(emp.getName());
      			System.out.println(emp.getAge());
          }

	}
	}
