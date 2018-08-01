package Exercises;

import java.util.*;

//3. Napisz funkcję, która przyjmuje dowolną kolekcję obiektów klasy Double i zwraca wartość maksymalną i minimalną tej kolekcji.
//Aby zwrócić 2 wartości z funkcji możesz zwrócić je w formie tablicy dwuelementowej lub napisać własną klasę reprezentującą
//parę o nazwie Pair.

//Znów bardzo ładnie zrobione zadanie :)
public class Exercise3 {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
      list.add(2.561);
      list.add(2.59);
      list.add(2.66);
      list.add(2.56);
      list.add(2.49);
      list.add(2.51);
        returnMaxAndMinValue(list);

    }

    public static double[] returnMaxAndMinValue(List<Double> inputList) {
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE ;
        for (int i = 0; i < inputList.size(); i++) {

            if (inputList.get(i) > max) {
                max = inputList.get(i);
            }
            if (inputList.get(i) < min) {
                min = inputList.get(i);
            }

        }
        // Jak w poprzednich: arr można od razu zwrócić.
        // return new double[]{mix, max}
        double[] arr = new double[]{min, max};

        return arr;

    }
}
