package com.project;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Service s= new Service();
		System.out.println("==========Product Managment========");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of database");
		int size= sc.nextInt();
		s.createdatabase(size);
		while(true) {
			System.out.println("=========Menu======");
			System.out.println("1.Add Product\n2.find by id\n3.find by comany"
					+ "\n4.Update by ID\n5.All Details\n6.Exit\nEnter the OPTION:-");
			int opt=sc.nextInt();
			switch(opt) {
			case 1:s.addproduct(); break;
			case 2:s.findbyID();; break;
			case 3:s.findbycompany(); break;
			case 4:s.UpdatebyID(); break;
			case 5:System.out.println("not implementes"); break;
			case 6:System.out.println("thank you.!!");
			sc.close();
			System.exit(0);
			}
		}
	}
}
