package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int minute = 0;

        Scanner scanner = new Scanner(System.in);
        minute = scanner.nextInt();

        int hour = minute / 60;
        int day = hour / 24;
        int year = day / 365;
        day = day - year * 365;
        System.out.println(minute+" minutes is approcimately "+year+" years and "+day+" days");
    }
}
