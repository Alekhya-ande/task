package com.epam.task;
import java.util.Scanner;

import com.epam.task.App;

public class compoundinterest {
     public static void main(String[] args) {
		App a=new App();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double p=sc.nextDouble();
		System.out.println("Enter the number of years : ");
		double t=sc.nextDouble();
		System.out.println("Enter the rate of interest : ");
		double r=sc.nextDouble();
		double res1=a.simple(p, r, t);
		double res2=a.compound(p, r, t);
		System.out.println("Simple Interest :"+res1);
		System.out.println("Compound Interest :"+res2);
		
		System.out.println("-----------------------------------------");
		System.out.println("1.Standard material");
		System.out.println("2.Above standard material");
		System.out.println("3.High standard material");
		System.out.println("4.Automated home");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		a.construction(choice);
		sc.close();
		
	}

}
interface  Total{
	void standard();
}
class Standard {
	
	void standard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area of land in sqfeet");
		double bal = sc.nextDouble();
		double total_cost = bal*1200;
		System.out.println("The total cost of construction = "+total_cost);
		sc.close();
	}
}
class AboveStandard {
	void standard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area of land in sqfeet");
		double bal = sc.nextDouble();
		double total_cost = bal*1500;
		System.out.println("The total cost of construction = "+total_cost);
		sc.close();
	}
}
class HighStandard  {
	void standard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area of land in sqfeet");
		double bal = sc.nextDouble();
		double total_cost = bal*1800;
		System.out.println("The total cost of construction = "+total_cost);
		sc.close();
	}
}
class AutomatedHome {
	void standard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area of land in sqfeet");
		double bal = sc.nextDouble();
		double total_cost = bal*2500;
		System.out.println("The total cost of construction = "+total_cost);
		sc.close();
	}
}
class Default {
	void standard() {
		System.out.println("Enter valid choice ");
	}
}

