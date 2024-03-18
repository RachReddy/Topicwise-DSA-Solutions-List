package com.Arrays.com;

public class Find_Largest_sum_contiguous_subarray {

	public static void main(String[] args) {
		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int res=Integer.MIN_VALUE;
		int len=arr.length;
		
		//B.F= O(n3)
		//Use 2 points for starting and ending point of subarray
	/*	
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
				res=Math.max(res, sum);
			}
		}
	*/	
		
	/*BETTER: O(n2)
		for(int s=0;s<len;s++)
		{
			int sum=0;
			for(int e=s;e<len;e++)
			{
				sum=sum+arr[e];
				res=Math.max(res, sum);
			}
			// common mistake: res=Math.max(res, sum);
		}
		
	*/

		
		//KADANE'S ALGORITHM : t.c= O(n)  s,c= O(1)
		
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
		
		

	}

}
