package com.kn.SelectionSort;

import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter the elements = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] brr = selectionSorting(arr);
		for(int i:brr)
		{
			System.out.println(i+" ");
		}
		sc.close();
			
	}

	public static int[] selectionSorting(int[] arr) 
	{
		System.out.println("After sorting elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			int min = arr[i];
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		return arr;
	}

}
