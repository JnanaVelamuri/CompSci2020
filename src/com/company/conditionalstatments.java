/*
Jnana Velamuri
6/19/20
create random object so you can create random objects for n
make constraint so that n is between 2-136
make if statement that finds whether n is divisible by 2
if it has a  remainder print line "weird"
if without a remainder make else if statement to see if its between 2-5 and if it is println "not weird"
if without a remainder and its not between 2-5 make else if statement to see if its between 6-20 println "weird"
if without a remainder and is not between 2-5 or 6-20 make else if statement to see if its greater that 20 if it is println "not weird"
 */
package com.company;
import java.util.Scanner;
import java.util.Random;
public class conditionalstatments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random1 = new Random();// for making the numbers random
        String answer;
            do {
                int n = random1.nextInt(137)+1;//makes the random number between 137 and 1
                System.out.println(n);// prints out the random number and of its weird or not
                solve(n);//makes the random number fo through the method loop to determine if weird or not weird
                System.out.println("do you want to play? Enter yes or no:");//ask if the person wants to play
                answer = sc.next();
            } while (answer.contains("y"));//if it detects a y it will play the loop, if there is no y it will continue asking until there is one


        }
    public static void solve (int n) {

        if (n % 2 == 1) {
            System.out.println("weird");// if it has a remainder will print weird
        } else if (n >= 2 || n <= 5) {
            System.out.println("not weird");// if no remainder and between 2-5 will print not weird
        } else if (n >= 6 || n <= 20) {
            System.out.println("weird");// if it has no remainder between 6-20 it will print weird
        } else if (n > 20) {
            System.out.println("not weird");// if no remainder and greater than 20 will print not weird
        }
    }
}



