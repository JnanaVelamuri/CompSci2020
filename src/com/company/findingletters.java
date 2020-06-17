package com.company;
import java.util.Scanner;
public class findingletters {

    public static void main(String[] args) {
        System.out.println("Please enter a phrase");
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring(0, indexOf + 1);
        char letter;
        int count = 0;
        for (int all = 0; all < firstword.length(); all++) {
                letter = firstword.charAt(all);
                if (letter != ' ' ) {
                count++;
                 String temp = phrase.substring(all + 1);
                indexOf = temp.indexOf(letter);
                while(indexOf >= 0) {
                    count++;
                  temp = temp.substring(indexOf + 1);
                  indexOf = temp.indexOf(letter);
                }
                firstword = firstword.replace(letter,' ');
                System.out.println(letter + " " + count);
                count = 0;
            }
        }
    }
}
