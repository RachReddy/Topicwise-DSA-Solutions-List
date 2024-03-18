package com.Arrays.com;

import java.util.ArrayList;
import java.util.List;

public class Cyclically_Rotate_Array_by_K_positions_LEFT {

	static void reverse(int[] arr, int s,int e)
	{
		while(s<=e)
		{
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}
	
	public static void main(String[] args) {
		
		
		//	index    0,1,2,3,4,5,6			
		int[] nums= {1,2,3,4,5,6,7};
		//	OUTPUT   4,5,6,7,1,2,3	
		int k=3;
		int len=nums.length;		
		k=k%len;
		
		
		//B.F rotate k times, T.C= O(n*k) s.c=0(1)
		/*
		while(k>0)
		{
			int last_elem=nums[len-1];
			for(int i=len-1;i>0;i--)
			{
				nums[i]=nums[i-1];
			}		
			nums[0]=last_elem;
			
			k--;
		}
		*/
		
		
		
		//OPTIMIZED: T.C= O(n)  S.C=O(1)
		
		// Reverse the entire array  
		reverse(nums, 0, len-1);    //[7,6,5,4,3,2,1]		//O(n)
		
		//Reverse the LAST k elem( index 4,5,6)
		reverse(nums, len-k, len-1);   	//[7,6,5,4,1,2,3]		//O(n-k)
		
		//Reverse the remaining elements
		reverse(nums,0,k);				//[4,5,6,7,1,2,3]		//O(k)
		
			
		
		//print array
		for(int i=0;i<len;i++)
		{
			System.out.print(nums[i]+" ,");
		}
		
	}

}
