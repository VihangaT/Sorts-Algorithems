import sortClasses.Printer;
import sortClasses.QuickSort;

import java.security.Principal;
import java.util.Random;

public class Sort {


    public static void main(String[] args){
        Printer printer=new Printer();
        Random rand = new Random();
        int[] inputArray= new int[10];

        for(int i = 0; i < 10; i++){
            inputArray[i]=rand.nextInt(100);
        }
        //unsorted Array
        System.out.println("UnsortedArray");
        printer.printArray(inputArray);


    }

}
