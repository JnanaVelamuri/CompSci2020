/*
Jnana Velamuri
06/26/20
        create new file (FP) that has twenty lines each with twenty tokens. make sure that there a animals, integers, and doubles as the tokens
        import java.util and java.io packages
        create public static void main. make sure to include throws FileNotFoundException
        create new file that equals the file FP
        make a new scanner that receives from the file
        define an int for the number of games played
        define an int for how many wins the player has
        create a String that takes input from the player if they want to guess a word
        create a String that determines whether the player guesses an int or a double based on user input
        make a String that determines whether or not you continue playing base on user input
        create little stick figure characters using System.out.println for extra credit
        print "do you want to start"
        make another string that equals the user's answer to the question above
        make a boolean that equals false
        start a do while loop
        make an if statement thats says great! and asks if you want to guess a word or number
        if answer contains "w" start code for word choice
        if answer contains "n" ask user if they want to guess int or double
        if answer contain "i" start code for integer choice
        else start code for double choice
        add 1 to total
        ask if user wants to play again using println
        make a input.next() line so the user can respond
        make a return method for doubly (defined in line 74) that adds 1 to count whenever a double is guessed correctly
        make a return method for integy (defined in line 70) that adds 1 to count whenever an integer is guessed correctly
        make a return method for wordy (defined in line 62) that adds 1 to count whenever an animal is guessed correctly
        */
package com.company;
import java.io.*;
import java.util.*;
public class finalprojectcode {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in); //this scanner receives input from the player/user
        int totalt = 0; //this is for the amount of games played
        String answer = "";
        int count = 0; //this int is for the total points
        String numbertype; //this is for line 64
        String continee = "";
        welcome();
        System.out.println("Want to play?(yes or no)"); //not completely necessary but it adds to the program
        String startresponse = input.nextLine();
        boolean errorstart = false;
        do { //because this is a do while loop, we can ask the user if they want to play again, and again, an infinite amount of times
            File file = new File("/Users/jnanavelamuri/Desktop/javaprogram/src/com/company/fp.txt");//this is for the file that we used
            Scanner sc = new Scanner(file); //this scanner receives from the file
            if (startresponse.equals("yes")) {
                System.out.println("Great! Would you like to guess a number or a word?"); //this prints if the user replies yes to the "Want to play?" statement
                answer = input.next();
                if (answer.contains("w")) { //if the answer contains w, then the program prints out "Cool!" and tells the user that the catorgory is anmals
                    System.out.println("Cool! The category for words is animals.(Make sure the first letter is capitalized)");
                    answer = " ";
                    String ogword = input.next(); //allows user to type in their guess
                    count = wordy(ogword, sc,count); //sends these variables to the method wordy. this is where count is returned
                }
                if (answer.contains("num")) { //if the user chooses number, it prints "integers of doubles"
                    System.out.println("Would you like integers or doubles?");
                    numbertype = input.next();
                    if (numbertype.contains("i")) { //if user chooses int, than the program tells them the range of integers
                        System.out.println("Awesome! The integer is between 1 and 200.");
                        int oginteger = input.nextInt(); //this is the user's guess
                        count = integery(oginteger, sc, count); //this sends the variables to the integery method. this is also where count is returned
                    } else { //we put else here instead of else if because if number type doesn't equal "i" we want the user to guess a double
                        System.out.println("Fantastic! The double is between 1.0 and 25.0.");
                        double ogdouble = input.nextDouble();
                        count = (int) doubly(ogdouble, sc, count); //this sends the variables to the doubly method. this is also where count is r
                    }
                }
                totalt = totalt + 1; //everytime the user plays a game, 1 is added the total times they've played
                System.out.println("Do you want to play again? You've played " + totalt + " time(s). You have " + count + " point(s)."); //this prints out how many times they've played and their points
                continee = input.next(); //the user can respond here

            }
            sc.close();
        } while (continee.contains("y")); //end of the do while loop
        if (startresponse != "yes") {//if the user says anything other than yes when the are asked if they want to start or continue, errorstart equals true
            errorstart = true;
        }
        if (errorstart == true) { //when errorstart is true, these lines are printed with a goodbye and the total times they played and their final score and the program ends.
            System.out.println("Okay Bye! ");
            System.out.println("You've played " + totalt + " time(s). You have " + count + " point(s).");
            bye();
        }
    }

    public static double doubly(double ogdouble, Scanner sc, int count) { //this whole method is to find out if the user got it right or wrong
        double double2 = 0;
        while (sc.hasNextLine()) {
            if (sc.hasNextDouble()) {
                ogdouble = (((int) (ogdouble * 100)) / 100.0); //this allows the user to actually get the double's right because the doubles that the user will say might equal something like this: 1.10009 when they type 1.1 and the program will count that as wrong
                if (sc.nextDouble() == (ogdouble)){ //if the user guesses correctly (their answer equals a double in the file) then it prints out "Congrats! You found a double!" and adds a point to their total
                    System.out.println("Congrats! You found a double!");
                    count++;
                    break;
                }
            }
            else {
                String huh = sc.next(); // if the answer is incorrect, then don't give the user a point
            }
        }
        return count; //returns count's new value to the public static void main
    }

    public static int integery(int oginteger, Scanner sc, int count) {
        int integer2 = 0;
        while (sc.hasNextLine()) {
            if (sc.hasNextInt()) {
                if (sc.nextInt() == (oginteger)) { //if the user guesses correctly (their answer equals a int in the file) then it prints out "Congrats! You found an integer!" and adds a point to their total
                    System.out.println("Congrats! You found an integer!");
                    count++;
                    break;
                }
            } else {
                String huh = sc.next();
            }
        }
        return count; //returns count's new value to the public static void main
    }

    public static int wordy(String ogword, Scanner sc, int count) {
        String word2 = "";
        while (sc.hasNextLine()) {
            if (sc.hasNext()) {
                if (sc.next().equals(ogword)){ //if the user guesses correctly (their answer equals an animal in the file) then it prints out "Congrats! You found an animal!" and adds a point to their total
                    System.out.println("Congrats! You found an animal!");
                    count++;
                    break;
                }

            }
        }
        return count; //returns count's new value to the public static void main
    }

    public static void welcome(){
        System.out.println("                              ----------"); //this is entirely extra credit
        System.out.println("  /^\\    ________     [>-<] <| Welcome!| ");
        System.out.println(" (0_0)  <|Hello! |      |    -----------");
        System.out.println(" -/ \\-   --------    --<|>--");
        System.out.println(" /_ _\\                  |");
        System.out.println("  | |                  _|_");
        System.out.println("  | |                  | |");
    }
    public static void bye(){
        System.out.println("                               -----------"); //this is entirely extra credit
        System.out.println("  /^\\    _________      [>-<] <| Adios!  | ");
        System.out.println(" (0_0)  <|Goodbye!|       |    -----------");
        System.out.println(" -/ \\-   ---------     --<|>--");
        System.out.println(" /_ _\\                    |");
        System.out.println("  | |                    _|_");
        System.out.println("  | |                    | |");
    }
}

