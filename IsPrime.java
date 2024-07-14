import java.util.*;
class IsPrime 
{
	public static boolean isPrime(int a){
		for(int i=2;i<a;i++){
			if(a%i==0){
				return false;
			}	
		}
       return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No foor Chack Prime");
		int val=sc.nextInt();
		boolean b=IsPrime.isPrime(val);
		if(b)
		System.out.println(val+" is Prime");
		else
			System.out.println(val+" not Prime");
	}
}
