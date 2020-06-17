package com.company;

public class gangsta {

    public static void main(String[] args) {
        String fullname = "Jnana Velamuri";
        sayHI(fullname);
        
    }

    public static void sayHI(String name) {
        int indexOf = name.indexOf(" ");
        char initial1= name.charAt(0);
            String lastname = name.substring(indexOf + 1);
            lastname = lastname.toUpperCase();
            String firstname=name.substring (0,indexOf);
            String gangstaname= initial1 + ".Diddy "+ lastname+" "+firstname + "-izzle";
            System.out.print("Your gangsta name is:"+ gangstaname);

        }
    }
