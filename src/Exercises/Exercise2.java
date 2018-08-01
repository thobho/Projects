package Exercises;
//2. Napisz funkcję, która jako argument przyjmuje tablicę liczb, a zwraca wartość średnią z wszystkich liczb.
//Sygnatura funkcji powinna wyglądać mniej więcej tak:
//static void double average(double[] inputArray)



public class Exercise2 {

    public static void main(String[] args) {

        double[] arr = new double[]{2.5,3.75,6.565,2.85,4.4,3.2,5.9,1.25,6.142,3.14};

        average(arr);

    }


    public static double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double av = sum / array.length;
        return av;
    }

}
