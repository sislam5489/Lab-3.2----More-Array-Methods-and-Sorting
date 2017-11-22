package lab3;
/**
  Lamia Islam && Kaitlyn Cao
  Period 6 and 7
  Description: Creating various array methods and sorting methods
 */
import java.lang.Math;
import lab3.Utilities;
public class Runner {


	public static void main (String[]args)
	{
		
		 String[] list1 = {"A", "C", "E", "G", "I", "K", "M", "O", "Q", "S", "U", "W", "Y"};
		String[] list2 = {"B", "D", "F", "H", "J", "L", "N", "P", "R", "T", "V", "X", "Z"};
		
		String[] list3 = merge(list1,list2);
		Utilities.printArr(list3);
		
		String[] mslist1 = {"M", "S", "K"};
		String[] mslist2 = {"C", "L", "I"};
		//printArr(mergeSort(mslist1));
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{	
		String[] result  = new String[list1.length + list2.length-1];
		int index = 0;
		for ( int i = 0; i < list1.length && i < list2.length; i++)
		{
			for(int j = 0;j<list1.length&& j<list2.length;j++)
			{
				if(list1[i].compareTo(list2[j])<=-1)
				{
					result[index] = list1[i] + " ";
					result[index+1] = list2[j] + " "; 
					index+=2;
				}
				else if(list1[i].compareTo(list2[j]) > 0)
				{
					result[index] = list2[j] + " ";
					result[index + 1] = list1[i] + " ";
					index+=2;
				}
				
			}
			/*result[index] = list1[i] + " " ;
			result[index+1] = list2[i] + " ";
			
			index += 2;*/
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
	
	public static String[] mergeSort(String[] list)
	{
		int middle = 0;
		
		if(list.length%2==1)
		{
			middle = Math.round(list.length/2);
		}
		else
		{
			middle = list.length/2;
		}
		
		
		if(list.length <= 1)
		{
			return list;
		}
		else
		{
			String[] left = new String[middle];
			String[] right = new String[list.length-middle];
			for(int i = 0; i < middle - 1; i++)
			{
				left[i] = list[i];
			}
			for(int i = middle; i < list.length-1; i++)
			{
				right[i-middle] = list[i];
			}
		
		
		return merge(mergeSort(left),mergeSort(right));
		}
	}
} 
