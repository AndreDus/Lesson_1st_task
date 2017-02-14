package com.company;

/**
 * Created by abych on 14.02.2017.
 */
public class exercise2part {

    public static void main(String [] args) {
        System.out.println("1)-------------------");
        int x = 10; int y = 4; int z = 1;
        System.out.println( x > y && y > z);

        System.out.println("2)-------------------");
        double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(d);

        System.out.println("3)-------------------");
        float f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println(f);

        System.out.println("4)-------------------");
        int a = 1; int b = 2; int c = 3;
        System.out.println(a + b * c);

        System.out.println("5)-------------------");
        System.out.println((a + b) * c);

        System.out.println("6)-------------------");
        int A = 2; int v = ++a + ++a * ++a;
        System.out.println(v);

        System.out.println("7-9)-------------------");
        System.out.println("Total: " + 3 + 4);
        System.out.println(12%3);
        System.out.println(13%3);

        System.out.println("10-12)-------------------");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.SIZE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("13)-------------------");
        for (int n = 1; n < 11; n++) {
            System.out.println("строка № " + n );
        }
    }
}
