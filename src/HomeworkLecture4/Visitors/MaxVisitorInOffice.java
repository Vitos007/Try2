package HomeworkLecture4.Visitors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class MaxVisitorInOffice {
    public static void main(String[] args) {
        Visitor[] visitors = Visitor.createVisitors();
        Arrays.sort(visitors, new Comparator<Visitor>() {
            @Override
            public int compare(Visitor o1, Visitor o2) {
                return o1.getComeTime() > o2.getComeTime() ? 1 : -1;
            }
        });
        for (Visitor visitor : visitors) {
            System.out.println("Come " + new Date(visitor.getComeTime()));
            System.out.println("Leave " + new Date(visitor.getLeaveTime()));
        }
        int maxVisitorAtOnce = 0;
        int maxVisitorAtOnceForThisIteration = 0;
        for (Visitor visitor1 : visitors) {
            for (Visitor visitor : visitors) {
                if (visitor1.getComeTime() < visitor.getComeTime()
                        & visitor1.getLeaveTime() > visitor.getComeTime()) {
                    maxVisitorAtOnceForThisIteration++;
                }
                if (maxVisitorAtOnce < maxVisitorAtOnceForThisIteration) {
                    maxVisitorAtOnce = maxVisitorAtOnceForThisIteration;
                }
            }
            maxVisitorAtOnceForThisIteration = 0;
        }

        /*Your code here*/


        System.out.println("Max visitors was " + maxVisitorAtOnce);
    }
}
