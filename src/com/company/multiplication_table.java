package com.company;

import java.util.Scanner;

/**
 * Created by abych on 15.02.2017. at 00:10
 */

public class multiplication_table {
    public static void main(String[] args) {
        System.out.print("введіть число: ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        for (int n = 1; n < 11; n++) {
            System.out.print(a + "*" + n + "="); System.out.println(a * n);
        }
    }
}
