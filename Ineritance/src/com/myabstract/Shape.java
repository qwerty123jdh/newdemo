package com.myabstract;

abstract public class Shape {
	private String name;
	public Shape() {
		name="entry";
	}
	

	public Shape(String name) {
		super();
		this.name = name;
	}

    public  void description() {
    	System.out.println("name:"+name);
    }
	abstract public double area();
	
	Shape s=new Shape() {
		
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
		
}
