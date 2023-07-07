// wap to should accept 3 argument via commandline of type operands operator and should display the result by performing upto calculatore
class Calculator// class name 
{
	public static void main(String [ ] args) // main method 
	{
		double a,b; //variable 
		String choice; //veriable
		a=Double.parseDouble(args[0]);//using Math class convert String to double 
		b=Double.parseDouble(args[2]);//using Math class convert String to double
		choice=args[1];
		switch(choice)//conditoin
		{
			case "+":
				System.out.println("Sum is "+(a+b));
				break;
			case "-":
				System.out.println("Diff is "+(a-b));
				break;
			case "*":
				System.out.println("Prod is "+(a*b));
				break;
			case "/":
				System.out.println("Div is "+((float)a/b));
				break;
			case "%":
				System.out.println("Rem is "+(a%b));
				break;
			default:
				System.out.println("Wrong choice");
				break; // end
		}
	}
}
			
			
			
