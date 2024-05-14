import java.util.*;
class IntIsPanlindrom 
{

	private static void isPalindrom(int n){

try{
		int sum=0,r,temp;
		temp=n;
		while(n>0){
          r=n%10;
		  sum=(sum*10)+r;
		  n=n/10;

		}
		if(sum==temp){
			
		System.out.println("No is palindrom : "+temp);
		}else{
			 System.out.println("No is not Palindrom : "+temp);
		}
		}catch(InputMismatchException ex){
			System.out.println("Please Enter Only Digit");

		}


	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No For Check Palingdrom");
		int no=sc.nextInt();
		isPalindrom(no);
		
		
		}
}
