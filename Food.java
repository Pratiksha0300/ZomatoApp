package com.zomato;

public class Food {
	int fid;
	String fname;
	double fprice;
	// int fqnty;

	public Food(int fid, String fname, double fprice) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
		// this.fqnty = fqnty;
	}

	@Override
	public String toString() {
		return "\n" + "\n" + fid + "." + fname + "              price=" + fprice + "\n";
	}
}
