package com.kn.BubbleSort;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array = ");
		int []arr = new int[sc.nextInt()];
		System.out.println("elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int[] crr = bubbleSort(arr);
		System.out.println("swapped elements are = ");
		for(int i:crr)
		{
		System.out.println(i+" ");
		}
		sc.close();
	}

	public static int[] bubbleSort(int[] arr) 
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				count=1;
				}
			}
				if(count==0)
					break;
				
			}
		return arr;
		}
	

}
