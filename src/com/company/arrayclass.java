package com.company;
import java.util.Arrays;
import java.util.Random;
public class arrayclass {
    public static void main(String[] args) {
        Random randy = new Random();
        int[] numbers = {2, 5, 8, 34, 14, 79, 32};
        int[] num2 = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num2[i] = randy.nextInt(95) + 5;
        }
        numbers = reverse(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(num2));
        num2 = reverse(num2);
        System.out.println(Arrays.toString(num2));
    }

    public static int[] reverse(int[] rev) {
        for (int i = 0; i < rev.length/2; i++) {
            int temp=rev [i];
            rev [i]= rev [rev.length-1];
            rev [rev.length-1]= temp;
        }
        return rev;
    }
}

