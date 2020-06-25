
package com.company;
import java.io.*;
import java.util.*;
public class finalprojectcode {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input= new Scanner (System.in);
        File file = new File("C");
        Scanner sc= new Scanner(file);
        String fileline;
        String answer;
        int finalscore = 0;
        String contresp = "";
        String numbertype;
        System.out.println("  /^\\");
        System.out.println(" (0_0)  < Hi!");
        System.out.println("  /|\\");
        System.out.println("  _|_");
        System.out.println("  | |");
        System.out.println("Do you want to start? (Yes or No)");
        String startresponse = input.nextLine();
        boolean errorstart = false;
        if (startresponse.equals("Yes")) {
            System.out.println("Great! Would you like to guess a number or a word?");
            answer = input.next();
            if (answer.contains("w")) {
                System.out.println("Cool! The category for words is animals.");
                // call the method
            }
            if (answer.contains("num")) {
                System.out.println("Would you like integers or doubles?");
                numbertype = input.next();
                if (numbertype.contains("i")) {
                    System.out.println("Awesome! The integer is between 5 and 140.");
                    // call method
                } else {
                    System.out.println("Fantastic! The double is between 2 and 11.");
                    //  call method
                    double ogdouble = input.nextDouble();
                    doubly(ogdouble,sc,input);
                }
            }
        }
    }
                public static void doubly ( double ogdouble, Scanner sc, Scanner input){
                    double double2= 0;
                    while (sc.hasNext()) {
                        if (input.hasNextDouble()) {
                            double2 = input.nextDouble();
                            if ( ogdouble == double2) {
                            }

                        }
                    }
                }
            }





//    public static void intgame(){
//        int response = 1;
//        do {
//            System.out.println("Do you want to continue?");
//            contresp = input.nextLine();
//            response = response - 1;
//        } while (response == 1);
//        if(contresp == "Yes"){
//
//        } else if(contresp != "Yes"){
//
//        }
//    }
//    }
//}


