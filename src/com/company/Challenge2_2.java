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
        for (int dash = 0; dash < 10; dash++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }

    public static void Top() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= (-2 * line) + (2 * 5); spaces++) {
                System.out.print(" ");
            }


            System.out.print("/");
            for (int slash = 0; slash <= 0 * line + 1; slash++) {
                System.out.print("/");
            }
            System.out.print("*");
            System.out.print("\\");
            for (int slashr = 0; slashr <= 0 * line + 1; slashr++) {
                System.out.print("\\");
            }
            System.out.print(" ");
            for (int spaces = 1; spaces <= (-2 * line) + (2 * SIZE); spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= (2 * line -10) ; spaces++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int slashr = 0; slashr <= 0 * line + 1; slashr++) {
                System.out.print("\\");
            }
            System.out.print("*");
            System.out.print("/");
            for (int slash = 0; slash <= 0 * line + 1; slash++) {
                System.out.print("/");
            }
            System.out.print(" ");
            for (int spaces = 1; spaces <= (2 * line -10); spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");

        }
    }
}

