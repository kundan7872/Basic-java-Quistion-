import java.util.*;
class ReverseArray 
{
	//reverse array with collections reverse method
	static void reversArray(Integer []a){
		Collections.reverse(Arrays.asList(a));
		System.out.print(Arrays.asList(a));
	}
		


	public static void main(String[] args) 
	{
		
		Integer [] arr={1,2,3,4,5};
		reversArray(arr);
		// reverse array with loop
		
		/*for(int i=arr.length-1;i>=0;i--){
		 arr[i]=arr[i];
		 System.out.print(" "+arr[i]);
		}
         */

		
	}
}
