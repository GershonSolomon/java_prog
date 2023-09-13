package pattern;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		try {
			System.out.print(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("0 should not be in divisor");
		}
		

	}

}
