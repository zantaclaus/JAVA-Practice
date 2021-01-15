package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 2; i <= number; i++) {
            if(number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
                i = 1;
            }
        }
    }
}
