package factorial;
import java.util.Scanner;
class facto{
	public int value(int a){
		int temp=1;
		for(int i=1;i<=a;i++) {
			temp=temp*i;
		}
		return temp;
	}
}

public class fact {
	public static void main(String[] args) {
	int a;
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	facto obb=new facto();
	System.out.println(obb.value(a));
	scan.close();
	
	}

}
