package lab3;
/**
  Lamia Islam && Kaitlyn Cao
  Period 6 and 7
  Description: Creating various array methods and sorting methods
 */
import java.lang.Math;
import java.util.Arrays;

import lab3.Utilities;
public class Runner {


	public static void main (String[]args)
	{
		
		String[] list1 = {"A", "C", "D", "G", "I", "K", "M", "O", "Q", "S", "U", "W", "Y"};
		String[] list2 = {"B", "E", "F", "H", "J", "L","N","P","R","T","V","X","Z"};
		int[]list = {5,1,6,4,3,2,9,0};
		System.out.print(partition(list));
		//String[] list3 = merge(list1,list2);
		//Utilities.printArr(list3);
		
		String[] mslist1 = {"M", "S", "K","A","Z","Y","L"};
		String[] mslist2 = {"C", "L", "I"};
		//Utilities.printArr(mergeSort(mslist1));
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{	
		String[] result  = new String[list1.length + list2.length];
		int index = 0;
		int i = 0, j = 0;
		
		while(i < list1.length && j < list2.length)
		{
				if(list1[i].compareTo(list2[j])<=0)
				{
					result[index] = list1[i];
					i++;
					index++;
				}
				else if(list1[i].compareTo(list2[j]) > 0)
				{
					result[index] = list2[j];
					j++;
					index++;
					
				}
				if(list1[list1.length-1].compareTo(list2[list2.length-1])<=0)
				{
					result[result.length-1] = list2[list2.length-1];
				}
				else if(list2[list2.length-1].compareTo(list1[list1.length-1])<=0)
				{
					result[result.length-1] = list1[list1.length-1];
				}
				
		}
		if(i<list1.length)
		{
			while(i<list1.length)
			{
				result[index] = list1[i];
				index++;
				i++;
			}
			
			
		}
		if(j<list2.length)
		{
			while(j<list2.length)
			{
				result[index] = list2[j];
				index++;
				j++;
			}
		
		}
			
		return result; 
	}
	
	public static String[] mergeSort(String[] list)
	{
		
		int middle = list.length/2;
		
		if(list.length <= 1)
		{
			return list;
		}
		else
		{
			String[] left = Arrays.copyOfRange(list,0,middle);
			String[] right = Arrays.copyOfRange(list,middle,list.length);
		
		
		
		
		return merge(mergeSort(left),mergeSort(right));
		}
	}
	public static void swap(int arr[],int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static int partition(int[] list)
	{
		int pivot = list[0], front = 0,back = list.length-1;
		while(front<back)
		{
			for(int i = front;i<list.length;i++)
			{
				if(list[i]<list[pivot])
				{
					swap(list,i,pivot);
					
					for(int j = back;j<1;j--)
					{
						if(list[j]<list[pivot])
						{
							swap(list,j,pivot);
							
						}
						back--;
					}
					
				}
				front++;
				
			}
		}
		return pivot;
	}
} 
