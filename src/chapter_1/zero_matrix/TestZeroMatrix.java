package chapter_1.zero_matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestZeroMatrix {

    ZeroMatrix zeroMatrix = new ZeroMatrix();

    @Test
    public void test1() {

        int[][] input = new int[][] {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}},
                expected = new int[][] {
                        {1, 0, 3},
                        {0, 0, 0},
                        {7, 0, 9}},
                actual = zeroMatrix.zeroMatrix(input);

        for(int i = 0; i < expected.length; i++) {
            for(int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    public void test2() {

        int[][] input = new int[][] {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 9}},
                expected = new int[][] {
                        {0, 0, 0},
                        {0, 5, 6},
                        {0, 8, 9}},
                actual = zeroMatrix.zeroMatrix(input);

        for(int i = 0; i < expected.length; i++) {
            for(int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}
