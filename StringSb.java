class StringSb11VersionOnWrad 
{
	public static void StBuffer(CharSequence s){
      if(s==null)
		  System.out.println("Hello World!");
	  else
		  System.out.println("Hello ");
	}
	public static void main(String[] args) 
	{
		StringSb.StBuffer("str");
		StringBuffer sb=new StringBuffer("string");
		System.out.println(sb);
	     StringSb.StBuffer(sb);
	}
}
