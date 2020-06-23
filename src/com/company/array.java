/*Jnana Velamuri
6/21/20
import scanner
have person type in the amount of times they want to loop and the corresponding amount of words
then make an Array 
if the number is even it goes into group
if the number is odd it goes into another group
println with the even group and then a space and then with the odd group all together
*/
package com.company;
import java.util.Scanner;
public class array {
        public static void main (String [] args) {
            Scanner sc = new Scanner(System.in);
            int t=0; // integer for the numbers
            do {
                System.out.println("the number of words your going to put:");
                t = sc.nextInt();// user gets to answer question
            } while (t<=0 || t>=11 );//makes code only use the amount of words that are allowed
            String [] words = new String [t];/* creates array- which is basically whatever number the user typed in for
                                               the amount of words they are going to put*/
            System.out.println("please enter your words:");
            for (int index=0; index<words.length; index++) { // creates loop and continues until reaching the number

                do {
                    words[index] = sc.next();// user answers the question
                } while (words[index].length() <= 1 || words[index].length() >= 10001);// makes code only use words that are allowed
            }
            for (int index = 0; index<words.length;index++){
                String newWord = scramble(words[index]);// allows it to go through the method to get the answer
                System.out.println(newWord);// prints final answer

            }
        }

        public static String scramble (String userWord) {
            String evenWord= "";//new string for even letters
            String oddWord= "";// new string for odd letters

            for (int even=0; even<userWord.length(); even += 2) {// calls all the even letters
                char temp= userWord.charAt(even);// all the even letters get put together
                evenWord = evenWord+temp;
            }
            for (int odd=1; odd<userWord.length(); odd += 2) {
                char temp = userWord.charAt(odd);// calls all the odd letters
                oddWord = oddWord + temp;// all the odd letters get put together
            }
            return (evenWord+ " "+oddWord);// puts the even and odd letter groups together with a space between them
        }
    }