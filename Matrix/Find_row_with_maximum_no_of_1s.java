package com.Matrix.com;

import java.util.ArrayList;
import java.util.List;

public class Find_row_with_maximum_no_of_1s {

	static int Max1sCount(int mat[][], int R, int C)
	{
		 int r=mat.length;
	     int c=mat.length-1;
	        
	        int max1scount=-1;
	        for(int i=0;i<r;i++)
	        {
	            int s=0;
	            int e=mat[i].length-1;
	            
	            while(s<=e)
	            {
	                int mid= s+ (e-s)/2;
	                if(mat[i][mid]== 0)
	                {
	                    s=mid+1;
	                }
	                else if( mat[i][mid]== 1)
	                {
	                    e=mid-1;
	                }
	              
	            }
	            int cnt= mat[0].length-s;
	          //  System.out.println(cnt); // prints 3,2,4,0
	            max1scount= Math.max(max1scount, cnt);
	            
	            
	        }
	        return max1scount;
	}
	
	
	public static void main(String[] args) {
		
		int[][] mat= {	{0,1,1,1},
							{0,0,1,1},
							{1,1,1,1},
							{0,0,0,0}
						};
		
	
		System.out.println( "the row with max no of 1s is "+ Max1sCount(mat,4,4));
		
		
		
/*		
		int r= matrix.length;
        int c= matrix[0].length;
        int res=-1;  //initialize to -1 cause if entire matrix is 0, the base condition it returns -1
       
        //B.F traverse each row and take no of 1s count, and keep updating res with max value
        //T.C= O(M*N) =>o(n2)  S.C=O(1)
        //do row wise traversal
        for (int i = 0; i < r; i++)
        {  	
          int cnt=0;
  	      for (int j = 0; j < c; j++)
  	      {
  	        if(matrix[i][j]==1)
  	        {
  	        	cnt++;
  	        }
  	      }
  	      res= Math.max(res, cnt);
  	          	  
        }           
        System.out.print(res); 
 */       
        
	}
}
