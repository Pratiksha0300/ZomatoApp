package com.zomato;

//import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZomatoDao {

	static int fid;
	static int qnty;
	List<Customer> cList = new ArrayList<Customer>();
	List<Food> cfooList = new ArrayList<Food>();
	Scanner scanner = new Scanner(System.in);

	public void addUser() {
		System.out.println("Enter Customer Details:");

		

		System.out.println("Enter the Customer name: ");
		String name1 = scanner.next();
		System.out.println("Enter the Customer address: ");
		String address1 = scanner.next();
		System.out.println("Enter the contact number ");
		long cno1 = scanner.nextLong();

		Customer customer = new Customer(name1, address1, cno1);
		cList.add(customer);

		System.out.println("Customer Details Added suceessfully!!");
		System.out.println();

		System.out.println(Zomato.hList);

		System.out.println("Add your food order:");
		makeOrder();
	}

	public void makeOrder() {
		boolean b = true;
        
		do {
			System.out.println("Enter hotel id to order food");
			int hid = scanner.nextInt();

			for (int i = 0; i < Zomato.hList.size(); i++) {
				Hotel h1 = (Hotel) Zomato.hList.get(i);
				if (hid == h1.hid) 
				{
					System.out.println(h1.fList);
					
					
					System.out.println("Enter Food item no:");
					fid = scanner.nextInt();
					for (int j = 0; j < Hotel.fList.size(); j++) 
					{
						Food f1 = (Food) Hotel.fList.get(j);
					
					if(fid==f1.fid)
					{
					System.out.println("Enter quantity");
					qnty = scanner.nextInt();
					cfooList.add(f1);
					}
					
					}
					System.out.println("1.if u want choose 2.generte bill ");
					if (scanner.nextInt() == 2)
						b = false;
				}
			}
		} while (b);
		bill();
	}

	 

	public void bill() {
		int sno = 1;
		int sum = 0;
		for (int i = 0; i < Hotel.fList.size(); i++) {
			Food f1 = (Food) Hotel.fList.get(i);

			if ((f1.fid == fid)) {
				System.out.println(sno++ + " " + f1.fname + " " + qnty + " " + f1.fprice + "  = " + qnty * f1.fprice);
				sum += qnty * f1.fprice;

				System.out.println("                             " + sum);
				System.out.println("Enter amount to pay your bill:");
				System.out.println();
				if (scanner.nextInt() >= sum) {
					System.out.println("Payment successfull!!!");
//		 				 try {
//		 					writeinfile();
//		 				} catch (IOException e) {
//		 					// TODO Auto-generated catch block
//		 					e.printStackTrace();
//		 				}
				} else {
					System.out.println();
					System.out.println("Payment not successfull!!");
					System.out.println();
					bill();
				}

			} 
//			else {
//				System.out.println("Srry, this food item is not available1!");
//				makeOrder();
//			}

		}
	}

}
