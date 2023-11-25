package com.kn.BinarySearch;

import java.util.Scanner;

public class ElementFoundOrNot {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element to be found = ");
		int element  = sc.nextInt();
		elementFoundOrNot(arr,element);
		sc.close();
	}

	public static void elementFoundOrNot(int[] arr, int element) 
	{
		int position=-1;
		int low=0;
		int high=arr.length-1;
		int mid=0;
		boolean isFound = false;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(element==arr[mid])
			{
				isFound=true;
				position=mid+1;
				break;
			}
			else if(element>arr[mid])
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
			}
		}
		if(isFound==false) {
			System.out.println(element+" = element not found");
		}
			else
			{
			System.out.println(element+" = element found");	
			}
		
	}

}
