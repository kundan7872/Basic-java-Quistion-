find odd or even by using command promt in java
class OddEven{
static public void main(String args[]){
int a;
a=Integer.parseInt(args[0]);// Take input by user in commandline & convert String to integer(Integer class & parseInt)
if(a%2==0)// condition check 
System.out.print("it is Even ");
else
System.out.print("it is odd ");
}
}
