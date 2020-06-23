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
        Random random1 = new Random();
        String answer;
            do {
                int n = random1.nextInt(137)+1;
                System.out.println(n);
                solve(n);
                System.out.println("do you want to play? Enter yes or no:");
                answer = sc.next();
            } while (answer.contains("y"));


        }
    public static void solve (int n) {

        if (n % 2 == 1) {
            System.out.println("weird");
        } else if (n >= 2 || n <= 5) {
            System.out.println("not weird");
        } else if (n >= 6 || n <= 20) {
            System.out.println("weird");
        } else if (n > 20) {
            System.out.println("not weird");
        }
    }
}



