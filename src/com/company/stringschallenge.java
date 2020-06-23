/*Jnana Velamuri
6/21/20
import scanner
have person type in the amount of times they want to loop and the corresponding amount of words
each letter then has a number
if the number is even it goes into group
if the number is odd it goes into another group
println with the even group and then a space and then with the odd group
 */
package com.company;
import java.util.Scanner;
public class stringschallenge {
public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);

    int t=0;
    int i=0;
    do {
        System.out.println("the number of words your going to put:");
        t = sc.nextInt();
    } while (t<=0 || t>=11 );

    System.out.println("please enter your words:");
    String userWord;
    do {
        do {
            userWord = sc.next();
        } while (userWord.length() <= 1 || userWord.length() >= 10001);
        i++;
        String newWord = scramble(userWord);
        System.out.println(newWord);

    } while(i<t);
}

    public static String scramble (String userWord) {
    String evenWord= "";
    String oddWord= "";

    for (int even=0; even<userWord.length(); even += 2) {
        char temp= userWord.charAt(even);
        evenWord = evenWord+temp;
    }
    for (int odd=1; odd<userWord.length(); odd += 2) {
        char temp = userWord.charAt(odd);
        oddWord = oddWord + temp;
    }
    return (evenWord+ " "+oddWord);
}
}
