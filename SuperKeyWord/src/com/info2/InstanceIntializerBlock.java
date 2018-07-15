package com.info2;

public class InstanceIntializerBlock {

int speed;
	public InstanceIntializerBlock() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("constructor is invoked"+speed);
	}
	{
		System.out.println("instance block is invoked");
		speed=120;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstanceIntializerBlock i=new InstanceIntializerBlock();

	}

}
