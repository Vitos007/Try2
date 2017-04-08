package edu.source.it.lectures.lecture3.homework;

import com.sun.xml.internal.bind.v2.model.core.ArrayInfo;

import javax.swing.plaf.SeparatorUI;
import java.net.SocketPermission;
import java.util.Arrays;

public class YourOwnBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 18, 11, 15, 17, 30, 19};
        int element = 10;
            // Bubble sort
        bubbleSort(array);
        elementSearch(array, element);
        System.out.println(Arrays.toString(array));

        }
    public static void elementSearch (int[] arr, int elem) {
        int arrayMin = 0;
        int arrayMax = arr.length - 1;
        int arrayIndex = (arrayMin + arrayMax) / 2;

        while (arrayMin < arrayIndex) {
            arrayIndex = (arrayMin + arrayMax) / 2;
            if (arr[arrayIndex] < elem) {
                arrayMin = arrayIndex + 1;
            } else if (arr[arrayIndex] > elem) {
                arrayMax = arrayIndex - 1;
            } else {
                System.out.println("Element " + elem + " in Array");
                break;
            }
        }
        if (arr[arrayIndex] != elem) {
            System.err.println("No such element in Array");
        }
    }
    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    }


