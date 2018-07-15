package com.map;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question implements Serializable {
	private int id;
	private String name;
	private Map<String, String> answers;
	public Question(int id, String name, Map<String,String> answers){
		this.id=id;
		this.name=name;
		this.answers=answers;
		
	}
	public void display(){
		System.out.println("enter Id :"+id);
		System.out.println("enter name :"+name);
		System.out.println("Answers...");
		Set <Entry<String,String>> set=answers.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Entry<String,String> entry=(Entry)itr.next();
			System.out.println("Answers "+entry.getKey()+"Posted By :"+entry.getValue());
			
		}
		
	}

}
