import java.util.*;
class ex4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter no. of 1 kg bags");
		a=sc.nextInt();
		System.out.println("enter no. of 5 kg bags");
		b=sc.nextInt();
		System.out.println("enter goal kgs");
		c=sc.nextInt();
		if(5*b+a>c){
			System.out.println("-1");
		}
		else{
			int b1=c%5;
			if(b1>a){
				System.out.println("-1");
			}
			else{
				System.out.println(b1%5);
			}
		}
	}
}
