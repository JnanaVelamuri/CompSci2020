
package com.company;
import java.io.*;
import java.util.*;
public class finalprojectcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("C\\Users\\JnanaVelamuri\\CompSci\\src\\com.company\\finalproject.txt");
        String fileline;
        String answer;
       System.out.println("Choose a number between 1-20?");//ask if the person to choose the line of file they want
       fileline = sc.next();// lets the user type number or word
        do {
            System.out.println("Would you like to guess a number or a word?");//ask if the person if they want to guess a number or a word
            answer = sc.next();// lets the user type number or word
        } while (answer.contains("n || w"));//if it detects a n or w


    }
}