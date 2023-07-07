// wap to should accept 3 argument via commandline of type operands operator and should display the result by performing upto calculatore
class Calculator
{
	public static void main(String [ ] args)
	{
		double a,b;
		String choice;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[2]);
		choice=args[1];
		switch(choice)
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
				break;
		}
	}
}
			
			
			