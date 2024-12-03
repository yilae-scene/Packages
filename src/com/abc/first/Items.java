package com.abc.first;

import java.util.Arrays;
import java.util.Scanner;

public class Items {
    public static void main (String [] a){
        printArray(sortIntegers(getIntegers(6)));
    }
    public static int[] getIntegers(int len){
        System.out.println("put in numbers:");
        int [] arrayCreated = new int[len];
        int i = 0;
        while(i < len){
            Scanner scan = new Scanner(System.in);
            arrayCreated[i] = scan.nextInt();
            i++;
        }
        return arrayCreated;
    }

    public static void printArray (int [] arrays){
        for(int i = 0; i < arrays.length; i++){
            System.out.println("Element "+i + " contents " +arrays[i]);
        }
    }

    public static int[] sortIntegers (int [] arrays){
        Arrays.sort(arrays);
        int [] sorted = new int[arrays.length];
        for(int i = 0; i < arrays.length; i++){
            sorted[i] = arrays[arrays.length -1 - i];
        }

        return sorted;
    }

}


