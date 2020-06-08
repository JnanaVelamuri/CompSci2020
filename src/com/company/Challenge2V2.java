package com.company;

public class Challenge2V2 {
public static int SIZE=4;
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
    }

    public static void Line() {
        System.out.print("#");
        for (int dash = 0; dash < 16; dash++) {
            System.out.print("=");
        }
        System.out.print("#");
        System.out.println();
    }

    public static void Top() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= (-2 * line) + (2 * SIZE); spaces++)
            {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - SIZE; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= -2 * line + 2 * SIZE; spaces++)
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= 2 * line -2; spaces++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= -4 * line +16; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= 2 * line - 2; spaces++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}




