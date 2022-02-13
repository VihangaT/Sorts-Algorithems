package sortClasses;

import java.util.Random;

public class SelectionSort {

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        System.out.println("Before:");
        printArray(numbers);
        //SelectionSort
        int n = numbers.length;

        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }



        System.out.println("After:");
        printArray(numbers);
    }
}
