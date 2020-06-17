package com.company;

public class kshape {
    public static final int SIZE = 5;


    public static void main(String[] args) {
        Top();
        Bottom();
    }

    public static void Top() {
        char letter = 65;
        for (int i = SIZE ; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");
            }
            System.out.println();
        }
    }

    public static void Bottom() {
        char letter = 65;
        for (int i = 0; i <= SIZE; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");
            }

            System.out.println();


        }
    }
}




