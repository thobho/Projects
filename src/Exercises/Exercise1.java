package Exercises;

import java.util.Random;
import java.util.Scanner;

//1. Napisz metorę, która jako parametr przyjmuje liczbę całkowitą N, a zwraca tablicę o długości N wypełnioną liczbami losowymi.
//Skorzystaj z klasy Random.
public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        createRandomArray(n);

    }


    public static int[] createRandomArray(int n) {

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            int x = rand.nextInt(100);
            arr[i] = x;
            System.out.println(arr[i]);
        }

        return arr;
    }
}
