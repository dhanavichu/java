package com.lucky;

import java.util.Scanner;

public class LuckyCust {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Date:");
	int date = sc.nextInt();
	System.out.println("Enter the BillNo:");
	int billno = sc.nextInt();
	int temp=billno%10;
	int temp1=billno%100;
	if(date<=9 )
	{
	   if(date==temp && billno%date==0)
	   {
	       System.out.println("Lucky Customers");
	   }
	   else{
	   System.out.println("Unlucky Customers");
	   }
	}
	else if((date>9 || date<=31))
	{
	   if(date == temp1 && billno%date==0)
	   {
	       System.out.println("Lucky Customers");
	   }
	   else{
	   System.out.println("Unlucky Customers");
	   }
	}

	else{
	   System.out.println("Unlucky  Customers");
	}
	}
}
