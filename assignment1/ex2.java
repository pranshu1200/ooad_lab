import java.util.*;

class submat{
	int m;
	int sub[][];
	submat(int x,int a,int b,int arr[][],int n){
		int i,j;
		m=x;
		sub=new int [m][m];
		System.out.println("sub array in fn is:");
			for(i=a;i<Math.min(n,a+x);i++){
				for(j=b;j<Math.min(b+x,n);j++){
					sub[i-a][j-b]=arr[i][j];
					System.out.print(sub[i-a][j-b]+"	");
				}
				System.out.println();
			}
		}
	}

class ex2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int n,i,j,k;
		n=sc.nextInt();
		int a[][]=new int[n][n];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[i][j]=random.nextInt(50);
			}
		}
		System.out.println("array is:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(a[i][j]+"	");
			}
			System.out.println();
		}
		int x;
		x=sc.nextInt();
		submat arr[]=new submat[(n*n)/(x*x)];
		int c=0;
		for(i=0;i<n;i=i+x){
			for(j=0;j<n;j=j+x){
				arr[c]=new submat(x,i,j,a,n);
				c++;
			}
		}
	}
}
