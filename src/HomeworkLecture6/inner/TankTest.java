package HomeworkLecture6.inner;

import java.io.IOException;

public class TankTest {
    public static void main(String[] args) {
        Tank tank = new Tank(0);
        try {tank.fire();}
        catch (Exception e) {System.out.println(e);}
        try {tank.fire();}
        catch (Exception e) {System.out.println(e);}
        try {tank.reload(10);}
        catch (Exception e) {System.out.println(e);}
        try {tank.load();}
        catch (Exception e) {System.out.println(e);}
        try {tank.fire();}
        catch (Exception e) {System.out.println(e);}
        try {tank.load();}
        catch (Exception e) {System.out.println(e);}
        try {tank.fire();}
        catch (Exception e) {System.out.println(e);}
        try {tank.load();}
        catch (Exception e) {System.out.println(e);}
        try {tank.fire();}
        catch (Exception e) {System.out.println(e);}
    }
}
