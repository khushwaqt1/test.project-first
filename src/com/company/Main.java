package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // for choice the values we can use this formul!

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        int arrayfrom[]={4,54,7,75,36,75,48,42,45,15};
        int[] arrayto= Arrays.copyOfRange(arrayfrom,5,6);
        for (int number:arrayto) {
            System.out.println(number);
        }

    }
}
