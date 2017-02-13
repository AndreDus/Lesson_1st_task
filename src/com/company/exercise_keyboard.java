package com.company;
import java.util.Scanner;
/**
 * Created by abych on 14.02.2017.
 */
public class exercise_keyboard {
    public static void main(String [] args){
    Scanner num = new Scanner(System.in);
    int a = num.nextInt(), b = num.nextInt();
    System.out.println(a+b);

    System.out.println("-------------------");
    Scanner number = new Scanner(System.in);
    System.out.print("введіть число 1: ");
    int c = number.nextInt();
    System.out.print("введіть число 2: ");
    int d = number.nextInt();
    System.out.print("сума 1+2= "); System.out.println(c+d);
    }
}
