package com.Matrix.com;

public class Kth_smallest_elem_in_RowCol_wise_sorted_matrix {

	public static void main(String[] args) {
		

		int[][] matrix= {{1,5,9},{10,11,13},{12,13,15}};
		int k=4;
		
		int R= matrix.length;
        int C= matrix[0].length;
        
        
        int requiredSmallerElements= k-1;
        int start= matrix[0][0];
        int end= matrix[R-1][C-1];
        
        
        while(start<=end)  //B.S breaking condition
        { 	 
       	 //assumedMedian= midElem or target
       	 int assumedKthElem = start + (end-start)/2;
       	 
       	 //find cnt= no of elem <= midElem
       	 int cnt = findCountOfSmallerElements(matrix, assumedKthElem);
       	 
       	 if(cnt<= requiredSmallerElements)  //x<=k-1  
       	 {								    //move right, start=mid+1
       		 start= assumedKthElem+1;
       	 }
       	 
       	 else								//x>k-1
       	 {								   // move left, end=mid-1
       		 end= assumedKthElem-1;
       	  }
        }
        
       // return start;    //or end+1;     
        System.out.println( start);
	
	}
        
        
        
        
        public static int findCountOfSmallerElements(int[][] matrix, int assumedKthElem)
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
    				
    				if( matrix[i][mid] <= assumedKthElem)  //or arr[mid]<= assumedMedian
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
