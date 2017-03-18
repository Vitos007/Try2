package HomeworkLecture4;

/**
 * Created by vitos on 17.03.2017.
 */
public class Fibonachi {
    public static void main(String[] args) {
        long startNumber = 1;
        long nextNumber = 1;
        double conditionGoldenSection = 1;

        while (conditionGoldenSection != (1.618)){
            long summ = startNumber + nextNumber;
            startNumber = nextNumber;
            nextNumber = summ;
           // System.out.println(nextNumber);
            conditionGoldenSection = Math.round((float)nextNumber/startNumber * Math.pow(10, 4)) / Math.pow(10, 4);
            System.out.println(nextNumber);
        }
    }
}
