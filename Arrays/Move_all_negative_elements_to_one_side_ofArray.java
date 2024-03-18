package com.Arrays.com;

public class Move_all_negative_elements_to_one_side_ofArray {

	public static void main(String[] args) {


		int[] nums= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int n=nums.length;
		
		//B.F=> t.c= N O(logN)  s.c=O(1)
        	//Arrays.sort(nums);
		
         /*
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ,");   //[-13 ,-12 ,-7 ,-6 ,-5 ,-3 ,5 ,6 ,11]
		}
		*/
		
		
        //OPTIMIZED: t.c= O(N)  s.c=O(1)
        int l=0;
        int r=n-1;
        
        while(l<=r)
        {
        	if(nums[l]<0 && nums[r]<0)  //if l & r are negative, no need to swap because they're already in the correct position (negative numbers are at the beginning).
        	{
        		l++;
        	}
        	
        	else if(nums[l]>0 && nums[r]<0) // l +ve , r -ve,  Positive numbers should be on the right side, and negative numbers on the left. 
        	{
        		int temp=nums[l];
        		nums[l]=nums[r];
        		nums[r]=temp;
        		
        		l++;
        		r--;
        	}
        	
        	else if(nums[l]>0 && nums[r]>0) // move to next iteration
        	{
        		r--; 
        	}
        	
        	else   //NOTE: you cannot skip this condition
        	{
        		l++;
        		r--;
        	}
        }
        
        
        for(int i=0;i<nums.length;i++)
        {
        	System.out.print(nums[i]+" ,");  // [-12 ,-6 ,-13 ,-5 ,-3 ,-7 ,5 ,6 ,11 ]
        }

         //NOTE:  Order of elements is not important here.
		
		
	}

}
