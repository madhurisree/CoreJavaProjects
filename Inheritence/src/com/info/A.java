package com.info;

 class A {
	public int a;
	public float b;

	void show(){
		System.out.println("b in super class :"+b);
	}
}
	 class B extends A {
		public int w;
		 public float e;
		B(int p, float q){
			w=p;
			super.b=q;
		}
		void show(){
			super.show();
			System.out.println("a in sub class :"+w);
		}
		}
	

