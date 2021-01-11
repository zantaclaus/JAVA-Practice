package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] lst = new int[100];
        for(int i = 0; i < N; i++)
            lst[i] = scanner.nextInt();

        for(int i = 0; i < N - 1; i++)
            for(int j = 0; j < N - 1; j++)
                if(lst[j] > lst[j+1]){
                    int temp = lst[j];
                    lst[j] = lst[j+1];
                    lst[j+1] = temp;
                }

        for(int i = 0; i < N; i++)
            System.out.print(lst[i] + " ");
    }

}
