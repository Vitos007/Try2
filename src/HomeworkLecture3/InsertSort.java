package edu.source.it.lectures.lecture3.homework;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {

        int[] array = {5, 7, 9, 15, 10, -1, 8};

        /*Your code here*/
        //     Stole from google
        int temp;
        for (int i = 1; i < array.length; i++){
            for (int j = i; (j > 0) && (array[j - 1] > array[j]); j-- ) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
