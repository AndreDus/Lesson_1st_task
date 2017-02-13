package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("1)-------------------");
        System.out.println("Вітаю!");

        System.out.println("2)-------------------");
        String name = "Студенте";
        System.out.println("Вітаю "+name+"!"); System.out.println("Hi " + args[0]);

        System.out.println("5)-------------------");
        int i=0;
        System.out.println(++i); System.out.println(i++); System.out.println(i);

        System.out.println("6-7)-----------------");
        boolean res1 = true; boolean res2 = false;
        System.out.println(!res2);
        System.out.println(!res1);

        System.out.println("8-13)-------------------");
        boolean a = true; boolean b = false;
        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(a|=b);
        System.out.println(a^=b);
        System.out.println(a&=b);

        System.out.println("14)-------------------");
        char c = 74; char d = 97; char e = 118; char f = 2615;
        System.out.print((char)c);
        System.out.print((char)d);
        System.out.print((char)e);
        System.out.print((char)d);
        System.out.println("! "+(char)f);

        System.out.println("15)-------------------");
        int A = 1; int B = 4; int C = 13; int D=1;
        System.out.println(A<10 && B>3);
        System.out.println(C<10 && D>3);
    }
}
