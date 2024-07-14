class PrimeNUm 
{
	public static boolean isp(int a){
		if(a>0){
			for(int i=2;i<a;i++){
				if(a%i==0){
					return false;
				}

			}

		}

          return true;

	}
	public static void main(String[] args) {
	
		if(isp(47)){
       System.out.println("Is P");
	}else{

System.out.println("not P");
	}
	}
}

