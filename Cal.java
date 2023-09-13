package example;

import java.util.Scanner;

public class Cal {
	
	
	public int add(int a,int b)
	{
		int res = a+b;
		return res;
	}
	
	public int sub(int a, int b)
	{
		int res = a-b;
		return res;
	}
	public int mul(int a, int b)
	{
		int res = a*b;
		return res;
	}
	public int div(int a, int b)
	{
		int res = a/b;
		return res;
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the cal:");
		String c = s.next();
		System.out.println("Enter the First number:");
		int a = s.nextInt();
		System.out.println("Enter the second number:");
		int b = s.nextInt();
		Cal cl = new Cal();
		try {
		switch (c) {
		case  "Add":
		
			System.out.print("Result:");
			System.out.println(cl.add(a, b));
			break;
		
		case "sub":
		
			System.out.print("Result:");
			System.out.println(cl.sub(a, b));
			break;
			
		case "mul":
		
			System.out.print("Result:");
			System.out.println(cl.mul(a, b));
			break;
			
		case  "div":
		
			System.out.print("Result:");
			System.out.println(cl.div(a, b));
			break;
			
		default:
			System.out.println("enter the correct cal");
		
		}}
		catch(ArithmeticException e) {
			System.out.println("Something went wrong");
		}
		s.close();
	}

}
