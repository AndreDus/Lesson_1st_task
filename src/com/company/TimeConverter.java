package com.company;

import java.util.Scanner;

/**
 * Created by abych on 16.02.2017. at 20:20
 */
public class TimeConverter {
    public static void main(String [] args){
        System.out.print("задайте кількість секунд: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hours = number/3600;
        int minutes = number/60;
        int seconds = number%60;
        System.out.println("Кількість годин - " + hours);
        System.out.println("Кількість хвилин - " + minutes);
        System.out.println("Кількість секунд - " + seconds);
        }
}

