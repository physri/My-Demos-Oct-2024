package com.myFirstSprBootProj.Spring.basics.applnContextDemos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myFirstSprBootProj.Spring.basics.Springin5steps.QuickSortAlgorithm;
import com.myFirstSprBootProj.Spring.basics.Springin5steps.SortAlgorithm;

public class ApplicationContextDemo {
	ApplicationContextDemo contextDemo;
	QuickSortAlgorithm quickSortAlgorithm;
	
	public QuickSortAlgorithm getQuickSortAlgorithm() {
		return quickSortAlgorithm;
	}
	public void setQuickSortAlgorithm(QuickSortAlgorithm quickSortAlgorithm) {
		this.quickSortAlgorithm = quickSortAlgorithm;
	}
	public ApplicationContextDemo getContextDemo() {
		return contextDemo;
	}
	public void setContextDemo(ApplicationContextDemo contextDemo) {
		this.contextDemo = contextDemo;
	}
	PersonDAO personDAO;
	public PersonDAO getPersonDAO() {
		return personDAO;
	}
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("ApplnContextEntries.xml");
			xmlContext.getBean(PersonDAO.class).getDaoContext();
			System.out.println(xmlContext.getBean(PersonDAO.class));
			System.out.println(xmlContext.getBean(ApplicationContextDemo.class));
			System.out.println(xmlContext.getBean(QuickSortAlgorithm.class));
	}

}
