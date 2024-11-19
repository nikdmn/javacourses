package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int element : array){
            if (element > max)
                max = element;
        }

        System.out.println("Наибольший элемент массива: " + max);

        int min = 10000;
        for (int element : array){
            if (element < min)
                min = element;
        }

        System.out.println("Наименьший элемент массива: " + min);

        int counter = 0;
        for (int element : array){
            if (element % 10 == 0)
                counter++;
        }

        System.out.println("Количество элементов массива, оканчивающихся на 0: " + counter);

        int sum = 0;
        for (int element : array){
            if (element % 10 == 0)
                sum += element;
        }

        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
