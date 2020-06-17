package com.company;

public class modifyingcode {
public static final double tax =0.8;
    public static final double tips =.15;

public static void main (String [] args) {
    int bill= 38;
    int bill2= 40;
    int bill3= 30;
  int subtotal= bill+bill2+bill3;
  double taxes = subtotal*tax;
  double tip= subtotal* tips;
  double total= subtotal + taxes + tip;
}
}
