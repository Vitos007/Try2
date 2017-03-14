package edu.source.it.lectures.lecture2.homework;

public class ClockAngel {
    public static void main(String[] args) {
        int hours = 2;
        int mins = 59;
        int result = 0;

        /*Your code here*/

        if (hours >= 0 && hours <= 12 && mins >= 0 && mins < 60){
            int hoursDegree = (360 / 12);
            int minsDegree = (360 / 60);
            if (mins * minsDegree > hours * hoursDegree) {
                result = mins * minsDegree - hours * hoursDegree;
            } else {
                result = hours * hoursDegree - mins * minsDegree;
            }
            if (result > 180) {
                result = 360 - result;
            }
            System.out.println("Angle between hours and minute narrows is " + result);
        } else {
            System.out.println("Angle between hours and minute narrows is cannot be identified");
        }
    }
}
