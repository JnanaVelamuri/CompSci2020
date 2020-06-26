package com.company;
import java.io.*;
import java.util.*;
public class filetesting {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/jnanavelamuri/Desktop/javaprogram/src/com/company/fp.txt");
        Scanner input = new Scanner(file);
        int number;
        double temp1 = 0;
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                temp1 = input.nextDouble();
            }
            double temp2 = 0;
            boolean flag= false;
            while (input.hasNext()) {
                if (input.hasNextDouble()) {
                    temp2 = input.nextDouble();
                }
                else{
                    String trash = input.next();
                }
                if(flag){
                System.out.printf("The difference %.2f %.2f is %.2f \n  " + temp1,temp2, (temp2-temp1));
                temp1=temp2;
            }

        }
    }
}}