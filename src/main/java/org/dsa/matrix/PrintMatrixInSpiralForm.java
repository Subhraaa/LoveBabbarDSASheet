package org.dsa.matrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

//Using Boundary Traversal - O(m*n) Time and O(1) Space
//We can print the matrix in a spiral order by dividing it into loops or boundaries. We print the elements of the outer boundary first, then move inward to print the elements of the inner boundaries.
//
//Algorithm:
//
//Define the boundaries of the matrix with variables top, bottom, left, and right.
//Print the top row from left to right and increment top.
//Print the right column from top to bottom and decrement right.
//Check if boundaries have crossed; if not, print the bottom row from right to left and decrement bottom.
//Print the left column from bottom to top and increment left.
//Repeat until all boundaries are crossed.
public class PrintMatrixInSpiralForm {
    private static final Logger logger = LoggerFactory.getLogger(PrintMatrixInSpiralForm.class);

    public static List<Integer> spirallyTraverseMatrix(int[][] mat) {
        int top = 0;
        int left = 0; //sonar qube does not recommend declaring more than one variable in same line
        int bottom = mat.length - 1;
        int right = mat[0].length - 1;

        List<Integer> res = new ArrayList<>(); //sonar qube objects return type to be ArrayList which implements List ( the actual return type we should add)

        while (top <= bottom && left <= right) {
            traverseTopRow(mat, top, left, right, res); //made separate functions for each method to give a clearer look according to sonar qube standard
            top++;

            traverseRightColumn(mat, right, top, bottom, res);
            right--;

            if (top <= bottom) {
                traverseBottomRow(mat, bottom, right, left, res);
                bottom--;
            }

            if (left <= right) {
                traverseLeftColumn(mat, left, bottom, top, res);
                left++;
            }
        }

        return res;
    }

    private static void traverseTopRow(int[][] mat, int row, int start, int end, List<Integer> res) {
        for (int i = start; i <= end; i++) {
            res.add(mat[row][i]);
        }
    }

    private static void traverseRightColumn(int[][] mat, int col, int start, int end, List<Integer> res) {
        for (int i = start; i <= end; i++) {
            res.add(mat[i][col]);
        }
    }

    private static void traverseBottomRow(int[][] mat, int row, int start, int end, List<Integer> res) {
        for (int i = start; i >= end; i--) {
            res.add(mat[row][i]);
        }
    }

    private static void traverseLeftColumn(int[][] mat, int col, int start, int end, List<Integer> res) {
        for (int i = start; i >= end; i--) {
            res.add(mat[i][col]);
        }
    }

    public static void main(String[] args) {
        int[][] matrixInput = {{23, 5, 20, 34, 1},
                {93, 4, 25, 29, 8},
                {83, 27, 63, 7, 34},
                {29, 74, 9, 16, 3},
                {30, 58, 49, 67, 14}};
        List<Integer> resultArray = spirallyTraverseMatrix(matrixInput);
        for (int ele : resultArray) {
            logger.info( "{} ", ele);

        }
    }
}
