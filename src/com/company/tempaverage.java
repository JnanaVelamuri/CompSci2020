/*Jnana Velamuri
6/23/20
import java package
create scanner and random
create a do loop asks user for how many days's of temperature
while loop that makes sure their number is within the constraint
then print that amount of random numbers
then find the average of them and print it out
then also find the days that were above average and print it out
 */
package com.company;
import java.util.Scanner;
import java.util.Random;
public class tempaverage {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        Random random1= new Random ();
        int days;
        int count = 0;
        double sum = 0.0;
                do {
                    System.out.println("how many day's of temperature:");
                    days= input.nextInt();
                } while (days > 100 || days< 2);
                int [] myArray= new int [days];
                for (int i =0; i< days; i++) {
                    myArray[i]= random1.nextInt(85)+25;
                    System.out.println("Day "+ (i+1)+ " temperature " + myArray [i]);
                    sum=sum + myArray[i];
                }
                double average = sum/days;
                System.out.println (" Average temperature = "+average);

                for (int i =0; i< days; i++) {
                    if (myArray[i]> average) {
                        count++;
                    }
        }
         System.out.println (count + " days that are above the average temperature ");
    }

}
