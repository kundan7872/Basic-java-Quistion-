import java.util.*;
class FibonacciSeries 
{
	public static void faboSeries(int a){
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<a;++i){
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter No For Fabonacci Series");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		FibonacciSeries.faboSeries(a);
	}
}
