package org.sofa.spring;

public class Triangle {
	public String type;
	public Triangle(String t) {
		type = t;
	}
    public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}

	public void draw() {
    	System.out.println("Triangle" + getType());
    }
}
