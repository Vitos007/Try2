package edu.source.it.lectures.lecture3.homework;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.Arrays;

public class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };

        //     Stole from google


        int[][] third = new int[second.length][first[0].length];

        for (int i = 0; i < second.length; i++ ) {
            for (int j = 0; j < first[0].length; j++ ) {
                for (int k = 0; k < first.length; k++){
                     third[i][j] += second[i][k] * first[k][j];
                }
            }
        }
        for (int i = 0; i < third.length; i++ ) {
            System.out.println(Arrays.toString(third[i]));
        }
    }
}
