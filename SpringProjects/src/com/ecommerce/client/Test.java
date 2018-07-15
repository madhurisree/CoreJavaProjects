package com.ecommerce.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ecommerce.bean.Cashier;
import com.ecommerce.bean.ShoppingCart;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//ClassPathResource resource=new ClassPathResource("com/ecommerce/configuration/myBeans.xml");
	ApplicationContext context=new ClassPathXmlApplicationContext("myBeans.xml");
	ShoppingCart shoppingCart=(ShoppingCart)context.getBean("shoppingCart");
	Cashier cashier=(Cashier)context.getBean("cashier");
	cashier.caluculateTotalPrice(shoppingCart);

	}

}
