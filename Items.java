package com.org;

public class Items implements Comparable<Items> {
private int ID;
private String name;
private double price;
public Items(int iD, String name, double price) {
	super();
	ID = iD;
	this.name = name;
	this.price = price;
}
public Items() {
	super();
	// TODO Auto-generated constructor stub
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Items [ID=" + ID + ", name=" + name + ", price=" + price + "]";
}
@Override
public int compareTo(Items arg0) {
	
	//return this.ID-arg0.getID();
	//return (int)(this.price-arg0.getPrice());
	return this.name.compareTo(arg0.getName());
}


}
