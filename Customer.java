package com.zomato;

public class Customer 
{
	String name;
	String address;
	long cno;
	
	public Customer(String name, String address, long cno) 
	{
		super();
		this.name = name;
		this.address = address;
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", cno=" + cno + "]";
	}
}
