package com.company;

public class Challenge2_2 {
    public static int SIZE = 4;

    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }

    public static void Line() {
        System.out.print("+");
        for (int dash = 0; dash <= 2 * SIZE; dash++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }

    public static void Top() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -1 * line + SIZE + 1; spaces++) {
                System.out.print(" ");
            }

            for (int fslash = 1; fslash <= 1 * line + SIZE - 5; fslash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int slash = 1; slash <= 1 * line + SIZE - 5; slash++) {
                System.out.print("\\");
            }
            for (int spaces = 1; spaces <= -1 * line + SIZE + 1; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int spaces = 1; spaces <= SIZE - line + 1; spaces++) {
                System.out.print(" ");
            }

            for (int slash = 1; slash <= line - 1; slash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            //System.out.print("/");
            for (int fslash = 1; fslash <= line - 1; fslash++) {
                System.out.print("/");
            }

            for (int spaces = 1; spaces <= SIZE - line + 1; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");

        }
    }
}



