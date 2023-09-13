package area;
import java.util.Scanner;
class shape{
	public void area(int length) {
		System.out.println("area of square:");
		int a=length*length;
		System.out.print(a);
	}
	public void area(int length,int breath) {
		System.out.println("area of rectangle:");
		int a=length*breath;
		System.out.print(a);
	}
}

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,breath,num;
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the 1 for area of square 2 for rectangle shape:");
		num=scan.nextInt();
		shape ob=new shape();
		
		if(num==1) {
			length=scan.nextInt();
		ob.area(length);
		}
		else {
			length=scan.nextInt();
			breath=scan.nextInt();
		ob.area(length,breath);
		
		}
		scan.close();
		
	}

}
