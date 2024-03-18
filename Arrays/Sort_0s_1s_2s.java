package com.Arrays.com;

public class Sort_0s_1s_2s {

	public static void main(String[] args) {
		
	 int[] nums = {2,0,2,1,1,0};
		
	//B.F=> N O(logN)
    //Arrays.sort(nums);


    //OPTIMIZED t.c= O(N)   s.c=O(1)
        int zero_cnt=0; 
        int one_cnt=0;
        int two_cnt=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                zero_cnt++;
            else if(nums[i]==1)
                one_cnt++;
            else
                two_cnt++;        
        }

        //rewrite array in place therfore no extra space needed
        for(int i=0;i<nums.length;i++)
        {
            if(zero_cnt>0)
            {
                nums[i]=0;
                zero_cnt--;
            }
            else if(one_cnt>0)
            {
                nums[i]=1;
                one_cnt--;
            }
            else
            {
                nums[i]=2;
                two_cnt--;
            }
        }
        
        
       //print array
        for(int i=0;i<nums.length;i++)
        {
        	System.out.print(nums[i]+" ");
        }



	}

}
