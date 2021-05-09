package com.nweligalla.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;

@Entity(name ="Students")
//@Table(name="Students")
public class Students {
	
	@Id
	private int rollNO;
	
	@Column(name="name")
	private String name;
	
//	@Transient for not getting stored
	
	@Column(name="color")
	private String color;
	
	
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Students [rollNO=" + rollNO + ", name=" + name + ", color=" + color + "]";
	}
	
	
	

}
