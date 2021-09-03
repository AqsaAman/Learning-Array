import java.util.*;
class EvenArray
{
	public static void main(String arg[])
	{		
		int arr [] = {1,2,3,4,5};
		//boolean size = arr.length % 2 == 0;
		for (int i=0; i< arr.length ; i++){
			if (i % 2 == 0) 
			System.out.println("Array Element: "+arr[i]);
		}
		
	}
	
}