package com.Arrays.com;

import java.util.Arrays;

public class Find_max_and_min_element_in_Array {

	public static void main(String[] args) {

		int[] nums= {2,5,4,1,3};
		int n=nums.length;
		int maximum_element= Integer.MIN_VALUE;
		int minimum_element= Integer.MAX_VALUE;
		
		
		//BF= t.c=  n O(logn)  s.c=1;
		/*
		Arrays.sort(nums);
		
		maximum_element= nums[n-1];
		minimum_element= nums[0];
		
		System.out.println("max value is "+maximum_element+" , min value is "+ minimum_element);
		*/
		
		
		
		//OPTIMIZED   t.c= 2o(N)=> O(N)		s.c=O(1)		
		for(int i=0;i<n;i++)
		{
			maximum_element= Math.max(maximum_element, nums[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			minimum_element= Math.max(minimum_element, nums[i]);
		}
		
		
		System.out.println("max value is "+maximum_element+" , min value is "+ minimum_element);
		
	}

}
