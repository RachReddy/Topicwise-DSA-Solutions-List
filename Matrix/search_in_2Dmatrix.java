package com.Matrix.com;

public class search_in_2Dmatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {

        //Brute force
        //T.C= O(r*c)  S.C=O(1)
       
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
       
	}		
	
	
	public static void main(String[] args) {
		
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int target=5;
		boolean res= searchMatrix(matrix,target);
		System.out.println(res);
		
		

	}

}
