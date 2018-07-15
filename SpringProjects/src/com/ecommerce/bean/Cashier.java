package com.ecommerce.bean;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

public class Cashier {
	private String fileName;
	private String filePath;
	private double totalPrice;
	private PrintWriter printWriter;
	public Cashier(String fileName, String filePath){
		this.fileName=fileName;
		this.filePath=filePath;
		openStream();
	}
	public void openStream(){
		try{
		printWriter=new PrintWriter(fileName+filePath+".txt");
		}
		catch(FileNotFoundException fe){
			System.out.println("while creating print object it creates Exception"+fe.getMessage());
		}
	}
	public void caluculateTotalPrice(ShoppingCart cart){
		List<Product> products=cart.getProducts();
		System.out.println(products.getClass());
		for (Product product : products) {
			writeToProductFile(product);
			totalPrice =totalPrice+product.getPrice();
			
		}
		printWriter.println("........");
		printWriter.println("total price :"+totalPrice);
		printWriter.flush();
	}
	public void writeToProductFile(Product product){
	printWriter.println("product name :"+product.getProductName()+"\tproduct price: "+product.getPrice()+"\tdate :"+new Date());
		
		
	}

}
