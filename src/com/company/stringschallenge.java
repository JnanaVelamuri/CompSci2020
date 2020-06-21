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
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    String userWord;
    System.out.println("please enter a word:");
   userWord = sc.next();
    String newWord = scramble(userWord);
System.out.println(newWord);
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
