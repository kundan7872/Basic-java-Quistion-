package Practice;

import java.util.Scanner;

//digit to print reverse digit
public class RevesDigit{//class name
    public static void main(String[] args) {
        int num=0;//variable initialize local variable
        int rev=0;//variable initialize local variable
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter digit ");
        num=kb.nextInt();//take input by user
        while (num!=0){//condition
            //logic
            int remember=num%10;
            rev=rev*10+remember;
            num=num/10;
        }//while loop body close
        System.out.print(" reverse digit is : "+rev);
    }//main method body close
}//class body close

