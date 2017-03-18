package edu.source.it.lectures.lecture3.homework;

import com.sun.xml.internal.bind.v2.model.core.ArrayInfo;

import java.util.Arrays;

public class YourOwnBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 18, 11, 15, 17, 30, 48};
        int element = 10;
        // Bubble sort
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; (j > 0) && (array[j - 1] > array[j]); j--) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
            // Element search
            int arrayMin = 0;
            int arrayMax = array.length;
            int arrayIndex = (arrayMin + arrayMax) / 2;
            do {
                if (array[arrayIndex] < element) {
                    arrayMin = arrayIndex;
                } else if (array[arrayIndex] > element) {
                    arrayMax = arrayIndex;
                } else {
                    System.out.println("Element " + element + " in Array have index " + arrayIndex);
                }
                arrayIndex = (arrayMin + arrayMax) / 2;
            }
            while ((array[arrayIndex] != element) ||
                    ((array[arrayIndex - 1] < element) && (array[arrayIndex + 1] > element)));
            if ((array[arrayIndex - 1] < element) && (array[arrayIndex + 1] > element)) {
                System.out.println("No element " + element + "in Array");
            }
        }
        // Why does not work???
    /* Your code here */
    }
}

