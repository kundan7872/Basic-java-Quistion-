import java.util.Scanner;
class Factorialusewhile{
public static void main(String args[]){
int n,f=1;
Scanner kb=new Scanner(System.in);
System.out.println("Enter on int ");
n=kb.nextInt();

while(n>1){
f=f*n;
n--;
}
System.out.println("Factorial of given no."+f);


}
}
