package com.Arrays.com;

public class Kadanes_algo_Minimum_subarray_sum {

	public static void main(String[] args) {
		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};		
		int len=arr.length;
	
		//KADANE'S ALGORITHM :Maximum subarray sum
		// t.c= O(n)  s,c= O(1)
		
		/*	
	    int res=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+arr[i]; //keep adding elements to sum
			
			res=Math.max(sum, res);
			
			if(sum<0)    //if sum<0 or -ve, then drop it (means, re-initialize sum to 0)
			{ 			 //else sum>0, do nothing, keep it  
				sum=0;
			}  
                           
			
		}		
		System.out.println("answer is "+res);
		*/	
		
		
	  //KADANE'S ALGO MODIFIED TO FIND "MINIMUM SUBARRAY SUM"
		
	    int res=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+arr[i]; //keep adding elements to sum
			
			res=Math.min(sum, res); //find minimum
			
			if(sum>0)    // If sum > 0, reset sum to 0
			{ 			
				sum=0;
			}  
                        			
		}		
		System.out.println("answer is "+res);  //ans is -5
	
		
		
	  //B.F
	  /*
		int res=Integer.MAX_VALUE;
		for(int s=0;s<len;s++)
		{
			for(int e=s;e<len;e++)
			{
				//find sum of all elem btwn 2 points, s and e
				int sum=0;
				for(int k=s;k<=e;k++)
				{
					sum=sum+arr[k];
				}
				res=Math.min(res, sum);
			}
		}
		System.out.println("answer is: "+res); 
	   */
	

	}
}

