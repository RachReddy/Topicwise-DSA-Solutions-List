package com.Matrix.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find_median_in_rowWise_sorted_matrix {

	public static void main(String[] args) {
		
		int[][] matrix= {{1,3,5},{2,6,9},{3,6,9}};
		
		int R= matrix.length;
        int C= matrix[0].length;

        
		//B.F= store all the elements of the given matrix in an array of size r*c.
		//Then we can sort the array and find the median
		
		//T.c=   O(n*m( logn*m))   where n*m iis temp array size

    /*       
		 // Flatten the matrix into a 1D list
	    List<Integer> li = new ArrayList<Integer>();
	    for (int i = 0; i < r; i++) {
	      for (int j = 0; j < c; j++) {
	        li.add(matrix[i][j]);
	      }
	    }
	 
	    // Sort the list
	    Collections.sort(li);
	 
	    // Find the median element
	    int mid_elem = li.size() / 2;
	    double median;
	    
	    
	    if (li.size() % 2 == 0) {     //if list is of even length
	      median = (li.get(mid_elem - 1) + li.get(mid_elem)) / 2.0;
	    } else {
	      median = li.get(mid_elem);
	    }
	 
	    System.out.println("ans is "+median);   //output =>5.0
   */
    //---------------------------------------------------------------------------------------------------------------------------    
    //OPTIMIZED: 
    //T.c= O(logm)+ nO(logm) => nO(logm)
    //S.C= O(1)    
       
     int N= R*C;
     int medianIndex= N/2;
     
     //you can find min & max from matrix or simple take the range given in problem statement like, 1<=N<=2000
     int start=1;
     int end=2000;
     
     
     while(start<=end)  //B.S breaking condition
     { 	 
    	 //assumedMedian= midElem or target
    	 int assumedMedian = start + (end-start)/2;
    	 
    	 //find k= no of elem <= midElem
    	 int k = findCountOfSmallerElements(matrix, assumedMedian);
    	 
    	 if(k<= medianIndex)
    	 {
    		 start= assumedMedian+1;
    	 }
    	 
    	 else
    	 {
    		 end= assumedMedian-1;
    	 }
     }
    // return start;    //or end+1;     
     System.out.println( start);
          
	}

	
	public static int findCountOfSmallerElements(int[][] matrix, int assumedMedian)
	{
		int count=0;		
		//traverse row by row and apply binary search
		for(int i=0;i<matrix.length; i++)
		{
			//matrix[i] is 1D array =0,1,2     (matrix[0] ={1,3,5}     matrix[1] ={2,6,9}     matrix[1] ={3,6,9})
			
			//Apply binary search on matrix[i]
			//int[] arr =matrix[i];
			
			int start=0;
			int end= matrix[i].length-1;  //-1 cuz end shld be at last index
			
			while( start <= end )
			{
				int mid=  start + (end-start)/2;
				
				if( matrix[i][mid] <= assumedMedian)  //or arr[mid]<= assumedMedian
				{
					start= mid+1;
				}
				else
				{
					end=mid-1;
				}
					
			}
			count=count+ start;   //or count= count+ end+1;
		}
		return count;	
    }
    
	

	

} 
