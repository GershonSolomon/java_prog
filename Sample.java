package exception;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot be divided by Zero");
		}
		sc.close();
	}

}
