import java.util.*;
class StringAnagramBest 
{
	public static void isAnagram(String s,String s1){
    char[] arr1=s.toLowerCase().toCharArray();
	char[] arr2=s1.toLowerCase().toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	if(Arrays.equals(arr1,arr2)){
		System.out.println("String is Annagram "+s);
	}else{
		System.out.println("String is Not Annagram "+s);
	}


	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String Check For Anagram Or Not");
		String s=sc.nextLine();
		System.out.println("Enter 2st String Check For Anagram Or Not");
		String s1=sc.nextLine();
         StringAnagramBest.isAnagram(s,s1);
		
	}
}
