package com.zantaclaus;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {3, 1, 2, 4, 5}; // Input
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
