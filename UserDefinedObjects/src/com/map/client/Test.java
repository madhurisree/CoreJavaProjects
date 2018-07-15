package com.map.client;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.map.Question;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("com/configuration/applicationContext.xml");
		BeanFactory  context=new XmlBeanFactory(resource);
Question question=(Question)context.getBean("e");
question.display();
	}

}
