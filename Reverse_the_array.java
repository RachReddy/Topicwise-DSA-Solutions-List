package com.Arrays.com;
public class Reverse_the_array {

	public static void main(String[] args) {
		
		//B.F: Reverse Using an Extra Array (Non In-place)
		//t.c= 0(n)  s.c= O(n)
		/*
		int[] nums= {1,2,3,4,5};
		
		int n=nums.length;
		int[] res=new int[n];
		
		int j=0;
		for(int i=n-1;i>=0;i--)
		{
			res[j]=nums[i];
			j++;
		}
		
		//print array
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ,");
		}
		*/
		
		
		
		//OPTIMIZED: 2Pointers or Reverse Using a Loop (IN- PLACE)
		//t.c= O(n)  s.c=O(1)
		int[] nums= {1,2,3,4,5};
		int n=nums.length;
		
		int s=0;
		int e=n-1;
		
		while(s<=e)
		{
			int temp=nums[s];
			nums[s]=nums[e];
			nums[e]=temp;
			s++;
			e--;
		}
		
		//print array
		for(int i=0;i<n;i++)
		{
			System.out.print(nums[i]+" ,");  //[5 ,4 ,3 ,2 ,1 ]
		}
			
		
		
		//NOTES: MORE APPROACHES: 1.use stack to store array every time u pop, print the elem
		//2. store array in a list DS, then use in built  Collections.reverse(list); to reverse it
		
		

	}

}
