/* Jnana Velamuri
6/23/20
import java util package
create a scanner
create a random
create 2 integers
the first integer will be how many numbers there are going to be
there will be constraints so that the amount of numbers are between 5-10 and the amount of numbers will be chosen randomly
the second integer will be random numbers
create public static int reverse
reverse the first integer
then make system.out.println(Arrray.toString(first integer))
then make system.out.println(Arrray.toString(second integer))
reverse the second integer
then make system.out.println(Arrray.toString(second integer))
create the reverse method
 */
package com.company;
import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Random randy = new Random();// for the random
        int num1 = randy.nextInt(5)+5;// makes the amount of numbers random
        int[] myArray = new int[num1];//
        for (int i = 0; i < num1; i++) {
            myArray[i] = randy.nextInt(95) + 5;// makes the random numbers not over 100 but not under 5
        }
            int index1;
            int index2;
            do{
                index1=randy.nextInt(num1);// chooses a random number randomly
                index2=randy.nextInt(num1);// chooses a random number randomly
            }while (index2== index1);
        System.out.println(Arrays.toString(myArray));// prints out the numbers before the swap
        swap(myArray,index1,index2);

    }
    public static int[] swap (int[]  swap,int index1, int index2) {// switches the two randomly chosen random numbers
        int temp = swap[index1];
        swap [index1]= swap [index2];
        swap[index2]=temp;

        System.out.println(Arrays.toString(swap));// prints out the numbers after the swap

        return swap;
    }
}



