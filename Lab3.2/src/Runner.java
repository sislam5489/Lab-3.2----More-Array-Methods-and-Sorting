/**
  Lamia Islam && Kaitlyn Cao
  Period 6 and 7
  Description: Creating various array methods and sorting methods
 */
public class Runner {


	public static void main (String[]args)
	{
		String[] list1 = {"A", "C", "E", "G", "I", "K", "M", "O", "Q", "S", "U", "W", "Y"};
		String[] list2 = {"B", "D", "F", "H", "J", "L", "N", "P", "R", "T", "V", "X", "Z"};
		
		String[] list3 = merge(list1,list2);
		printArr(list3);
		
		String[] mslist1 = {"M", "S", "K"};
		String[] mslist2 = {"C", "L", "I"};
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{	
		String[] result  = new String[list1.length + list2.length];
		int index = 0;
		for ( int i = 0; i < list1.length && i < list2.length; i++)
		{
			result[index] = list1[i] + " " ;
			result[index+1] = list2[i] + " ";
			index += 2;
		}
		if(list1.length > list2.length)
		{
			for(int j = list2.length; j<list2.length; j++)
			{
				result[index] = list1[j] + " ";
			}
		}
		
		else
		{
			for(int j = list1.length; j<list2.length; j++)
			{
				result[index] = list2[j] + " ";
			}
		}
		return result; 
	}
	
	
	public static void printArr(String[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
	}
	
	public static String[] mergeSort(String[] list)
	{
		if(list.length <= 1)
		{
			return list;
		}
		else
		{
			
		}
	}
} 
