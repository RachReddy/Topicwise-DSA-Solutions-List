package com.Matrix.com;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> li=new ArrayList<>();

        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;

        while(left<=right && top<=bottom)
        {

            //move right
            for(int i=left;i<=right;i++)
            {
                li.add( matrix[top][i] );
            }
            top++;

            //move bottom
            for(int i=top;i<=bottom;i++)
            {
                li.add( matrix[i][right] );
            }
            right--;

             // Move left
            if (top <= bottom) // Check if there are more rows left to traverse
            {
                for (int i = right; i >= left; i--) 
                {
                    li.add( matrix[bottom][i] );
                }
            }
            bottom--;

            // Move up
            if (left <= right) // Check if there are more columns left to traverse
            {
                for(int i=bottom;i>=top;i--)
                {
                     li.add( matrix[i][left]);
                }
            }
            left++;
        }
        return li;


    }
}