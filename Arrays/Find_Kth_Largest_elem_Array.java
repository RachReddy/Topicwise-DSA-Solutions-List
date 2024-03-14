package com.Arrays.com;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Find_Kth_Largest_elem_Array {

	//to be done
	public static void main(String[] args) {
	
		int arr[] = {7, 10, 4, 3, 20, 15};
		int K = 3;
		int kth_largest=Integer.MIN_VALUE;
		int n=arr.length;
		
		
		//B.F  t.c=O(nlogn) s.c=O(1)
		/*
		  
		Arrays.sort(arr);    //[3,4,7,10,15,20]
		
		int counter=n-K;    //6-3
		kth_largest= arr[counter];   		
		System.out.println("answer is "+kth_largest);
		*/
		
		
		
		//OPTIMIZED
		//t.c= O(n)  s.c= 0(n)
		PriorityQueue priorityQueue=new PriorityQueue();
		for(int i=0;i<arr.length;i++)
		{
			priorityQueue.add(arr[i]);
		}
		
		//System.out.println(priorityQueue);
		//NOTE:PriorityQueue in Java doesn't guarantee the order when you print it directly. 
		//If you want to print the elements of the priority queue in sorted order, you need to dequeue elements one by one.
		
		int counter=n-K;
		while(!priorityQueue.isEmpty() && counter>0)
		{			
			priorityQueue.poll();
			counter--;
			
		}
		kth_largest= (int) priorityQueue.poll(); //poll or peek
		System.out.println("answer is "+kth_largest);  //10
		
		
		
	}

}
