package com.zomato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
	static Food food;
	static List<Food> fList = new ArrayList<Food>();
	Scanner scanner = new Scanner(System.in);
	int hid;
	String hname;
	String loc;

	public Hotel(int hid, String hname, String loc) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.loc = loc;
	}

	public void addFood() {
		System.out.println("Enter hotel id in which you want add food items");
		int hid = scanner.nextInt();

		for (int i = 0; i < Zomato.hList.size(); i++) {
			Hotel h1 = (Hotel) Zomato.hList.get(i);
			if (hid == h1.hid) {
				System.out.println();
				System.out.println("Add The food Details:");
//				System.out.println("Enter the food id ");
//				int fid = scanner.nextInt();
				System.out.println("Enter the food name ");
				String fname = scanner.next();
				System.out.println("Enter the food price ");
				double fprice = scanner.nextDouble();
				// System.out.println("Enter the food quantity ");
				// int fqnty = scanner.nextInt();

				food = new Food(fList.size()+1, fname, fprice);
				fList.add(food);
				System.out.println();
				System.out.println("New Food item added successfully!!");
				System.out.println();
			}
//				else 
//				{
//					System.out.println("Hotel with this id is not available");
//				}
		}
	}

	@Override
	public String toString() {

		return "\n" + hid + "." + " Hotel " + hname + "\n";

	}

}
