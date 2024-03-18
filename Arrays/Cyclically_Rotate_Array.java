package com.Arrays.com;

public class Cyclically_Rotate_Array {

	//NOTE: the extra space use to solve this problem is O(1), therefore S.C=O(1)
	//Q: what is the space used in ur algo, that is O(N) i.e, the array size
	//we are solving this prbm in place, so keep ur points extra clear to interviewer when asked what is space used.
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		//			5,1,2,3,4
		
		int length=arr.length;
	
		
		int last_elem=arr[length-1];
		for(int i=length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}		
		arr[0]=last_elem;
	
		//print array
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+ " ,");
		}

	}

}
//OR
/*
int first_elem=arr[0];
for(int i=1;i<length;i++)
{
	arr[i-1]=arr[i];
	//arr[i]=arr[i-1]  is wrongg
}
arr[length-1]=first_elem;
*/
