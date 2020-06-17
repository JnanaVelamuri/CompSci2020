/*Jnana Velamuri
6/16/20
Create java for scanner
Declare variables:
int,double, string
Declare scanner
Create a System.out.println where you let the person choose their variables
-aka declare 3 new variables and scan each of them
print a new line with the original i added with the persons chosen variable
print a new line with the original d added with the persons chosen variable
print a new line with the original s added with the persons chosen variable
 */
package com.company;
import java.util.Scanner;
public class data_type_challenge {

    public static void main(String[] args) {

        int i = 5;
        double d= 25.0;
        String s= "happy birthday ";
        Scanner scan = new Scanner(System.in);
        System.out.println("enter integer");
        int myi = scan.nextInt();
        System.out.println("enter double");
        double myd = scan.nextDouble();
        System.out.println("enter string");
        String mys = scan.next();
        System.out.printf("%d \n ", i + myi);
        System.out.printf("%10.1f \n ", d + myd);
        System.out.printf("%s \n ", s + mys);


    }
}
