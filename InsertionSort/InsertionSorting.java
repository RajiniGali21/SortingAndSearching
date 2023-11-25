package com.kn.InsertionSort;

import java.util.Scanner;

public class InsertionSorting {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter the elements =");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] brr = insertionSorting(arr);
		for(int i:brr)
		{
			System.out.println(i+" ");
		}
		sc.close();
	}

	public static int[] insertionSorting(int[] arr)
	{
		System.out.println("After sorting elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return arr;
	}

}
