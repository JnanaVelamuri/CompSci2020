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
        Random randy = new Random();
        int num1 = randy.nextInt(5)+5;
        int[] myArray = new int[num1];
        for (int i = 0; i < num1; i++) {
            myArray[i] = randy.nextInt(95) + 5;
        }
            int index1;
            int index2;
            do{
                index1=randy.nextInt(num1);
                index2=randy.nextInt(num1);
            }while (index2== index1);
        System.out.println(Arrays.toString(myArray));
        swap(myArray,index1,index2);
        System.out.println(Arrays.toString(myArray));

    }
    public static int[] swap (int[]  swap,int index1, int index2) {
        int temp = swap[index1];
        swap [index1]= swap [index2];
        swap[index2]=temp;

        System.out.println(Arrays.toString(swap));

        return swap;
    }
}



