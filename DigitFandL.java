package Practice;//pacakges 

import java.util.Scanner;
//find last digit number and first and not last
public class DigitFandL{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
int first=0;//variable initialize

        System.out.println("enter some digit ");
        int i=kb.nextInt();//take input by user

        System.out.println("digit is not last  "+i/10);//all digit print not last
        int last=i%10;
        while (i>=10){//condition for print first digit
            i=i/10;
        }
        first=i;
        System.out.println("first digit is "+first);
        System.out.println("Last digit is "+last);

    }

}
