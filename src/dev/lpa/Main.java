package dev.lpa;

import java.util.Arrays;
import java.util.Random;
import com.abc.first.Items;
public class Main {
    public static void main(String[] args) {
        int [] array = getRandomArray(10);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int [] nextArray = new int[10];
        System.out.println(Arrays.toString(nextArray));
        Arrays.fill(nextArray, 23);
        System.out.println(Arrays.toString(nextArray));
        System.out.println("---".repeat(3));

        int [] copyArray = getRandomArray(50);
        Arrays.sort(copyArray);
        System.out.println(Arrays.toString(copyArray));
        int [] copiedArray = Arrays.copyOf(copyArray, 5);
        System.out.println(Arrays.toString(copiedArray));
        System.out.println(Arrays.toString(copyArray));
    }

    private static int[] getRandomArray (int len){
        Random random = new Random();
        int [] newInt = new int[len];
        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(2500);
        }
        return newInt;
    }
}