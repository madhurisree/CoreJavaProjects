package com.info1;

public class Car extends Vechicle {
	int speed;
Car(int speed){
	super();//it is invoked default constructor
	this.speed=speed;
	System.out.println("subclass is invoked");
}
public void display(){//this keyword does not work on the static method

	System.out.println(this.speed);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c=new Car(105);
c.display();

	}

}
