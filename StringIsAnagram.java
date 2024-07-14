import java.util.Arrays;
import java.util.Scanner;

public class StringIsAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
		boolean bol=false;
		a=a.toUpperCase();
        b=b.toUpperCase();

char [] d=new char[a.length()];
char [] e=new char[b.length()];
for(int i=0;i<a.length();i++){
     d[i]=a.charAt(i);
     e[i]=b.charAt(i);
     
}
     Arrays.sort(d);
	 Arrays.sort(e);
	 String s=new String(d);
     String s1=new String(e);

	 if(s.equals(s1)){

     bol=true;
	 }
     return bol;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
