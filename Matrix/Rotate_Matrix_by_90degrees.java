package com.Matrix.com;

class Solution {
    public void rotate(int[][] matrix) {


    //B.F= t.c=  O(r*c) or O(n2)     s.c = O(r*c)  
    /*
        int r=matrix.length;
        int c=matrix[0].length;
        int ans[][]=new int[r][c];
        int n=r; //length of matrix

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans[j][(n-1)-i]= matrix[i][j];
            }
        }
        
       //replace input matrix elem with ans matrix since the return type is void
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=ans[i][j];
            }
        }

    */
    //------------------------------------------------------------

    //OPTIMIZED :tc O(n2) sc=O(1)
     int r=matrix.length;
     int c=matrix[0].length;  

     
		//Tranpose means, swap the rows to column and column to rows
		for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse each row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }


    }
}