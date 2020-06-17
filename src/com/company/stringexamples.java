package com.company;

public class stringexamples {
    public static void main(String[] args) {
        sayHI("Marty");

        String teacher = "Maria Suarez";
        sayHI(teacher);
        Challenge2V2.Line();
    }

    public static void sayHI(String name) {
        System.out.println("This name is " + name.length() + " characters long");
        System.out.println("Hello " + name);
        int indexOF = name.indexOf(" ");
        System.out.println("The indexOF S is = " + indexOF);
        if (indexOF > 0) {
            String lastName = name.substring(indexOF+1);
            lastName=lastName.toUpperCase();
            System.out.println("The lastName= " + lastName);

        }
        if (name.length() > 4) {
            char letter;
            letter = name.charAt(4);
            System.out.println("The charcter=" + letter);
        }
    }
}