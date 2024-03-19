package com.Arrays.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_all_duplicates_in_Array {

	public static void main(String[] args) {
		
		int[] nums= {2, 10,10, 100, 2, 5, 11,2,11,2};

	
	//B.F=  T.C= O(N2)	S.C=O(N)
	/*	
		int len=nums.length;
		List<Integer> res=new ArrayList<>();  
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(nums[i]==nums[j] && !res.contains(nums[i]) )  //NOTE: w/o 2nd condition, al will store dupliucates
				{
					res.add(nums[i]);
					break;     //imp bcz if duplicate found at any index, we need not furthet check for arr[i]
				}
					
			}
		}
		
		//print result
		for(int i=0;i<res.size();i++) {
			System.out.print((int)res.get(i)+ " ");
		}
	*/
		
	//OPTIMIZED:  T.c=O(N) S.C=O(N)+O(M) //list & map
		
		 Map<Integer,Integer> hm=  new HashMap<Integer,Integer>();
		 List<Integer> res=new ArrayList<>(); 	        
		 int len=nums.length;
		 
	        for(int i=0;i<nums.length;i++){
	            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
	        }	
	        
	        for(int i=0;i<len;i++)
	        {
	        	//key= array elem     val= occurence of array elem
	        	int v=(int) hm.get(nums[i]);
	        	if(v>1 && !res.contains(nums[i]) )
	        		res.add(nums[i]);	        		
	        }
	        
	      //print result
			for(int i=0;i<res.size();i++) {
				System.out.print((int)res.get(i)+ " ");
			}
	
		
		
	}

}
