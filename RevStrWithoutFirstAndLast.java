import java.util.*;
class RevStrWithoutFirstAndLast
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.next();
		int lastIdex=str.length()-1;
		String s="";
		for(int i=str.length()-2;i>0;i--){
			s=s+str.charAt(i);

		}
		System.out.println("After Reverse Strin is:"+str.charAt(0)+s+str.charAt(lastIdex));
	}
}
