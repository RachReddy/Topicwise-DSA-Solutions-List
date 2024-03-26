package com.Arrays.com;

import java.util.HashMap;
import java.util.Map;

public class Print_all_pairs_equal_to_given_sum {

	public static void main(String[] args) {
		
		int arr[] = {1, 5, 7, -1, 5}; 
		int sum = 6;
		
		//B.F  T.c= O(n2)
		/*
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(sum== (arr[i]+arr[j]))
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
		
		//OUTPUT : if u want to handle duplicates use set
					(1,5) ,(1,5) ,(7,-1)
	
		*/
		
		//------------------------------------------------------------------
		
		//T.c=O(n)
		  Map<Integer, Integer> m = new HashMap<>();

	        for (int i = 0; i < arr.length; i++)
	        {
	            // Search if a pair can be formed with arr[i].
	            int rem = sum - arr[i];
	            if (rem == arr[i])
	            {
	                // Check if the complement is in the map and occurs only once
	                if (m.containsKey(rem) && m.get(rem) == 1)
	                {
	                    System.out.println("(" + rem + ", " + arr[i] + ")");
	                }
	            } 
	            else if (m.containsKey(rem) && !m.containsKey(arr[i]))
	            {
	                // Check if the complement is in the map and the current element is not in the map
	                System.out.println("(" + rem + ", " + arr[i] + ")");
	            }
	            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1); // Update the map with the current element's count

	}
	}
}
