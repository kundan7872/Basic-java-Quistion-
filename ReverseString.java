import java.util.Scanner;
class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String Value");
		String str=sc.next();
		String s="";
		for(int i=str.length()-1;i>=0;i--){
			s=s+str.charAt(i);

		}
		System.out.println("After reverse String is : "+s.toLowerCase());
	}
}
