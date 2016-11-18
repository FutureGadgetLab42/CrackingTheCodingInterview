package chapter_1.zero_matrix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an mxn matrix, A, output a matrix R such that:
 *  if A[i][j] = 0, then:
 *      R[i][k] = 0 for all 0 <= j <= n and
 *      R[k][j] = 0 for all 0 <= j <= m
 * */
public class ZeroMatrix {

    int[][] zeroMatrix(int[][] matrix) {
        if(matrix.length == 0) return matrix;
        Set<Integer> zeroIndices = new HashSet<>();

        int[][] result = new int[matrix.length][matrix[0].length];
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 0) {
                    zeroIndices.addAll(Arrays.asList(new Integer[]{row, col}));
                    for(int i = 0; i < Math.max(matrix.length, matrix[0].length); i++) {
                        if(row - i >= 0) {
                            result[row - i][col] = 0;
                        }
                        if(row + i < matrix.length) {
                            result[row + i][col] = 0;
                        }
                        if(col + i < matrix[row].length) {
                            result[row][col + i] = 0;
                        }
                        if(col - i >= 0) {
                            result[row][col - i] = 0;
                        }
                    }
                }
                if(!zeroIndices.contains(row) && !zeroIndices.contains(col))result[row][col] = matrix[row][col];
            }
        }
        return result;
    }

}
