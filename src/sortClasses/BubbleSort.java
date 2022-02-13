package sortClasses;

import java.util.Random;

public class BubbleSort {


    public static void main(String[] args){

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        System.out.println("Before:");
        printArray(numbers);


        //BubbleSort
        boolean swappedSomthing=true;
        while(swappedSomthing) {
            swappedSomthing=false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomthing=true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i+1] = temp;
                }
            }
        }

        System.out.println("After:");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
