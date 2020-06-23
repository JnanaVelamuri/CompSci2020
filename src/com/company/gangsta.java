package com.company;

public class gangsta {

    public static void main(String[] args) {
        String fullname = "Jnana Velamuri";
        sayHI(fullname);
        
    }

    public static void sayHI(String name) {
        int indexOf = name.indexOf(" ");
        char initial1= name.charAt(0);// identifies the first letter of the full name
            String lastname = name.substring(indexOf + 1);// finds the second name
            lastname = lastname.toUpperCase();// makes the last name upper cased
            String firstname=name.substring (0,indexOf);// finds the first name
            String gangstaname= initial1 + ".Diddy "+ lastname+" "+firstname + "-izzle";// puts the first letter, diddy, the last name (which is upper cased), the first name, and izzle all together
            System.out.print("Your gangsta name is:"+ gangstaname);// prints out "your gangta name is:" along with the final answer

        }
    }
