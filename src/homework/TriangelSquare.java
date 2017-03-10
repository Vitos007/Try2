package edu.source.it.lectures.lecture2.homework;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        float length = 0;
        float square = 0;

        double side12 = Math.sqrt(Math.abs(Math.pow(x2, 2) - Math.pow(x1, 2)) + Math.abs(Math.pow(y2, 2) - Math.pow(y1, 2)));
        double side23 = Math.sqrt(Math.abs(Math.pow(x3, 2) - Math.pow(x2, 2)) + Math.abs(Math.pow(y3, 2) - Math.pow(y2, 2)));
        double side31 = Math.sqrt(Math.abs(Math.pow(x3, 2) - Math.pow(x1, 2)) + Math.abs(Math.pow(y3, 2) - Math.pow(y1, 2)));

        length = (float)Math.round(side12) + (float)Math.round(side23) + (float)Math.round(side31);

        float halfLength = length / 2;
        square = (float)Math.round(Math.sqrt(halfLength * Math.abs(halfLength - side12) * Math.abs(halfLength - side23) * Math.abs(halfLength - side31)));

                /*your code here*/

        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
