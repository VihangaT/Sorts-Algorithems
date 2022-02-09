import java.util.Random;

public class Sort {
    public static void main(String[] args){
        Random rand = new Random();
        int[] inputArray= new int[10];

        for(int i = 0; i < 10; i++){
            inputArray[i]=rand.nextInt(100);
        }

        //unsorted Array
        System.out.println("UnsortedArray");
        printArray(inputArray);

        //Sorting


        //Sorted Array
        System.out.println("SortedArray");
        printArray(inputArray);
    }

    private static void printArray(int[] inputArray) {
        for (int j : inputArray) {
            System.out.println(j);
        }
    }
}
