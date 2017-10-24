package org.sofa.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {

	public static void main(String[] args) {
		//BeanFactory beanFactory  = new XmlBeanFactory (new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle =  (Triangle) context.getBean("triangle");
		triangle.draw();
	}


}
