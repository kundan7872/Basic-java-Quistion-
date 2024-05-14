import java.util.*;
class IsPalindrom
{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
	  System.out.println("String For Chack Palindrom");
	  String str=sc.next().trim();
	  String s="";
	  for(int i =str.length()-1;i>=0;i--){
		  s=s+str.charAt(i);


	  }
	  if(str.equals(s)){
		  System.out.println("Yes Given String Is Palindrom : "+str.toUpperCase());
		  
	  }else{
		  
		  System.out.println("Given String Is Not Palindrom : "+str.toUpperCase());
	  }
	  
	}
	
}