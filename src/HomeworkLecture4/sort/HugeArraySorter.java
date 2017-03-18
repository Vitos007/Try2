package edu.source.it.lectures.lecture4.homework.sort;

public class HugeArraySorter {
    public static void main(String[] args) {
        int[] hugeArray = ArrayCreator.createHugeArray(10);

        /*your code here*/

        int rangeIndex = 0;
        int[] tempArray = new int[hugeArray.length];
        for (int i = 1; i > 9; i++) {
            for (int j = 0; j < hugeArray.length; j++) {
                if (hugeArray[j] == i) {
                    tempArray[rangeIndex] = hugeArray[j];
                    rangeIndex++;
                }
            }
        }
        System.arraycopy(tempArray, 0, hugeArray, 0, hugeArray.length);

        for (int index = 0; index < hugeArray.length - 1; index++) {
            if (hugeArray[index] > hugeArray[index + 1]) {
                System.out.println("Sort failed!!!");
                return;
            }
        }

        System.out.println("Sort successful!!");
    }
}
