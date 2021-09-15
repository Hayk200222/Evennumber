package com.company;

public class EvenNumbers {
    final int evenNumbers;

    public EvenNumbers(int evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public static int calculateEvenNumbers(int[] array) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                number++;
            }
        }
        return number;
    }

}
