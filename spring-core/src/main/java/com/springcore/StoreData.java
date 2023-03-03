package com.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using xml format (setter injection)
       
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//		Employee emp = (Employee) factory.getBean("emp1");
//		System.out.println(emp.getEmpName());
		
//		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp1 = (Employee) con.getBean("emp");
//		System.out.println(emp1.getEmpName());
		
		// using xml format (constructor injection)
		
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//		Employee emp2 = (Employee) factory.getBean("emp");
 //    	System.out.println(emp2.empName);
     	
//     	ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
//     	Employee emp1 = (Employee) con.getBean("emp1");
//     	System.out.println(emp.empName);	
		
		
		// Using Annotation format for constructor injection
		
//		ApplicationContext con = new AnnotationConfigApplicationContext(MyConfiguration.class);
//		Employee emp = con.getBean(Employee.class);
//		    emp.empName="rio";
//		System.out.println("name is "+emp.empName);
		
		//using  annotatation format for setter injection
		
//		ApplicationContext con1 = new AnnotationConfigApplicationContext(MyConfiguration.class);
//		Employee emp1 = con1.getBean(Employee.class);
//		emp1.setEmpName("priya");
//		System.out.println("name is"+emp1.getEmpName());
		
		// Scope of a bean
		
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) con.getBean("emp");
		emp.setEmpName("praveen");
		System.out.println(emp.getEmpName());
		
		Employee emp4 = (Employee) con.getBean("emp");
		System.out.println(emp4.getEmpName());
				
		
		
		
		
	
	} 
}
