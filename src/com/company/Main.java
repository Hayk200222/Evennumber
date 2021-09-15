package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 3;
        array[2] = 7;
        array[3] = 9;
        EvenNumbers evennNumbers = new EvenNumbers(EvenNumbers.calculateEvenNumbers(array));
        System.out.println(evennNumbers.evenNumbers);
    }
}
