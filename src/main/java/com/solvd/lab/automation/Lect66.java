package com.solvd.lab.automation;


import java.util.Arrays;
import java.util.Random;

class Point2D2 {
    private int x;
    private int y;

    public Point2D2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Points {
    private Points() {

    }

    public static double distance(Point2D2 p1, Point2D2 p2) {
        return 0;
    }
}

class PointFactory {
    public static Point2D2 getRandom2dPoint() {
        return new Point2D2(((int)Math.random()* 100), ((int)Math.random()* 100));
    }
}

class TimeContstant {
    public static final int SHORT_TIMEOUT = 2;
    public static final int MID_TIMEOUT = 5;
    public static final int PAGE_LOADED_TIMEOUT = 10;

    private TimeContstant() {

    }
}

public class Lect66 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int x = 50;
        f(x, arr);
        System.out.println(x);
        System.out.println(Arrays.toString(arr));
        g(x, arr);
        System.out.println(x);
        System.out.println(Arrays.toString(arr));

        Point2D2 p = PointFactory.getRandom2dPoint();


    }

    private static void f(int x, int[] arr) {
        x = 40;
        arr[0] = 70;
    }

    private static void g(int x, int[] arr) {
        x = 80;
        arr = new int[] {20, 40, 60};
    }

    private static void h(Point2D2 p) {
        p = new Point2D2(4, 6);
    }
}
