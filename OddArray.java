import java.util.*;
class OddArray
{
	public static void main(String arg[])
	{		
		int arr [] = {1,2,3,4,5};
	
		for (int i=0; i< arr.length ; i++){
			if (i % 2 != 0) 
			System.out.println("Array Element: "+arr[i]);
		}
		
	}
	
}