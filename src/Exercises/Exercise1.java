package Exercises;

import java.util.Random;
import java.util.Scanner;
//Badzo dobrze rozwiązane zadanie.
//1. Napisz metorę, która jako parametr przyjmuje liczbę całkowitą N, a zwraca tablicę o długości N wypełnioną liczbami losowymi.
//Skorzystaj z klasy Random.
public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        createRandomArray(n);
    //Twoja funckja createRandomArray tworzy tablicę i wyświetla ją. Proponuję, żeby przenieść wyświetlanie liczby do metody main.
     //   System.out.println(createRandomArray(n));
    }

    public static int[] createRandomArray(int n) {

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            //Nie musisz przypisywać liczby losowej do x, skoro wykorzystujesz ją tylko jeden raz.
            // Może być od razu arr[i] = rand.nexInt();
            int x = rand.nextInt(100);
            arr[i] = x;
            
          
            System.out.println(arr[i]);
        }

        return arr;
    }
}
