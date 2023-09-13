package thread;

import java.util.Scanner;

public class Thread {
	
	void t1(int a) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(Integer.toString(a)+" * "+Integer.toString(i) + " = " + Integer.toString(a * i));
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		Thread t= new Thread();
		t.t1(a);
		sc.close();

	}

}
