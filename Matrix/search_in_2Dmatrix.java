package com.Matrix.com;

public class search_in_2Dmatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {

         //Brute force
        //T.C= O(r*c)  S.C=O(1)
       
		/*
        int r= matrix.length;
        int c= matrix[0].length;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==target)
                 return true;
            }
        }
        return false;
        */
		
		//NOTE: before using BinarySearch ask interviewer that u are assuming the matrix is sorted by rows, hence using B; Ask if the Matrix is sorted order or no.
		//Better: Perform Binary search on each row of matrix => nlog(n)   rlog(c)
		int r= matrix.length;
        int c= matrix[0].length;
        
        for(int i=0;i<r;i++)
        {
        	int l=0;
        	int h=c-1; // or matrix[0].length-1;
        	int row_no=i;
        	return binarySearch(matrix,l,h,target,row_no); //NOTE: rof u dont use return in this line, ans will always be false since ur not returning the answer from binarysearch function call
        	
        }
		return false;
       
	}	
	public static boolean binarySearch(int[][] matrix,int l,int h, int target,int row_no)
	{
		while(l<=h)
		{
			int mid= l+(h-l)/2;
			if(matrix[row_no][mid]==target)
				return true;
			else if( matrix[row_no][mid]<target )
				l=mid+1;
			else if( matrix[row_no][mid]>target )
				h=mid-1;
		
		}
		return false;
	}
	
	//OPTIMAL: 2 pointers: i=0, j=1st row last elem and move either down/left searching for target & make sure ur pointers are not out of bound
	//T.c= O(m+n) s.c=0(1)
	
	
	public static void main(String[] args) {
		
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int target=2;
		boolean res= searchMatrix(matrix,target);
		System.out.println(res);
		
		

	}

}
