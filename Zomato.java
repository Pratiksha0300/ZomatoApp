package com.zomato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zomato {
	static List<Hotel> hList = new ArrayList<Hotel>();
	static ZomatoDao zomatoDao;
	static Hotel hotel;

	public static void main(String[] args) {
		zomatoDao = new ZomatoDao();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Zomato!!!");

		for (;;)

		{
			System.out.println();
			System.out.println("Choose from following: 1.Customer 2.Admin");
			switch (scanner.nextInt()) {
			case 1: {
				System.out.println();
				zomatoDao.addUser();
				break;
			}
			case 2: {
				for (;;)

				{
					System.out.println();
					System.out.println("Do you want to Add Hotel? yes/no");

					if (scanner.next().equalsIgnoreCase("yes")) {
						System.out.println();
						System.out.println("Add Hotel Details:");

//						System.out.println("Enter the hotel id ");
//						int hid = scanner.nextInt();
						System.out.println("Enter the hotel name ");
						String hname = scanner.next();
						System.out.println("Enter the location of the hotel ");
						String loc = scanner.next();

						hotel = new Hotel(hList.size()+1, hname, loc);
						hList.add(hotel);
						System.out.println();
						System.out.println("Hotel details added successfully!! ");
						System.out.println();
						System.out.println(hList); 
						System.out.println();
						for (;;) {
							System.out.println();
							System.out.println("Do you want to Add Food items? yes/no");

							if (scanner.next().equalsIgnoreCase("yes")) {
								hotel.addFood();

							} else {
								break;
							}

						}
					} else {
						//System.out.println(hList);
						break;
					}

				}

			}
			}

		}
	}
}