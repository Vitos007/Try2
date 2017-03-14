package edu.source.it.lectures.lecture3.homework;


import java.util.Arrays;

public class MatrixInverter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1},
                {7, 5, 4, 1}
        };
        int[][] temp = new int[4][4];

        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++ ) {
                temp[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < temp.length; i++ ) {
            System.arraycopy(temp[i], 0, array[i], 0, temp[i].length);
        }
        for (int i = 0; i < array.length; i++ ) {
            System.out.println(Arrays.toString(array[i]));
        }

    /* Your code here */

    }
}