package com.project;

import java.util.Scanner;

public class Service {
	Product[] arr;
	int k=0;
	Scanner sc=new Scanner(System.in);
	void createdatabase(int size) {
		arr = new Product[size]; 
	}
	void addproduct() {
		System.out.println("========adding into database==========");
		if(k==arr.length) {
			System.out.println("database is full");
		}
		else {
			System.out.println("enter the product ID");
			int id=sc.nextInt();
			System.out.println("enter the product name");
			String name=sc.next();
			System.out.println("enter the price");
			double price=sc.nextDouble();
			System.out.println("Enter the company name");
			String cname =sc.next();
			System.out.println("Enter the quantity");
			int qty=sc.nextInt();
			Product p=new Product(id, name, price, cname, qty); 
			arr[k++]=p;
			System.out.println("Product has been added to the database");
		}
		System.out.println("=============================================");
	}
	void findbyID(){
		System.out.println("=======================================");
		System.out.println("Enter the ID");
		int id=sc.nextInt();
		int c=0;
		for(Product ele: arr) {
			if(ele.getPid()==id) {
				System.out.println("product id is      : "+ele.getPid());
				System.out.println("product name is    : "+ele.getPname());
				System.out.println("product Price is   : "+ele.getPprice());
				System.out.println("product company is : "+ele.getCompany());
				System.out.println("product  Quantity  : "+ele.getQty());
				c++;break;
			}
		}
		if(c==0) {
			System.out.println("Product ID NOT FOUND");
		}
		System.out.println("==========================================");
	}
	void findbycompany(){
		System.out.println("=======================================");
		System.out.println("Enter the company name");
		String Compname=sc.next();
		int c=0;
		for(Product ele: arr) {
			if(ele.getCompany().equals(Compname)) {
				System.out.println("product id is      : "+ele.getPid());
				System.out.println("product name is    : "+ele.getPname());
				System.out.println("product Price is   : "+ele.getPprice());
				System.out.println("product company is : "+ele.getCompany());
				System.out.println("product  Quantity  : "+ele.getQty());
				c++;break;
			}
		}
		if(c==0) {
			System.out.println("Company Name is NOT FOUND");
		}
		System.out.println("==========================================");
	}
	void UpdatebyID(){
		System.out.println("============================================");
		System.out.println("Enter the product ID");
		int id=sc.nextInt();
		for(Product ele: arr) {
			if(ele.getPid()==id) {
				System.out.println("enter the option you would like to update\n1. Product name\n2. Product price\n3. Company name\n4. Quantity");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("current name is "+ele.getPname()+"\nEnter the new Name");
					ele.setPname(sc.next());
					System.out.println("The name is changed to "+ele.getPname());
				case 2:
					System.out.println("current Price is "+ele.getPprice()+"\nEnter the new Price");
					ele.setPprice(sc.nextDouble());
					System.out.println("The Price is changed to "+ele.getPprice());
				case 3:
					System.out.println("current Company name is "+ele.getCompany()+"\nEnter the new Company name");
					ele.setCompany(sc.next());
					System.out.println("The Price is changed to "+ele.getCompany());
				case 4:
					System.out.println("current Quantity is "+ele.getQty()+"\nEnter the new Company name");
					ele.setQty(sc.nextInt());
					System.out.println("The Quantity changed to "+ele.getQty());
				default:System.out.println("Invalid input");break;
				}
			}
		}
	}
	void alldetails() {
		if(arr.length>0) {
			for(Product ele: arr) {
				System.out.println("product id is      : "+ele.getPid());
				System.out.println("product name is    : "+ele.getPname());
				System.out.println("product Price is   : "+ele.getPprice());
				System.out.println("product company is : "+ele.getCompany());
				System.out.println("product  Quantity  : "+ele.getQty());
				System.out.println("==================================================");
			}
		}
		else System.out.println(" --------Database is Empty-----------");
	}
}