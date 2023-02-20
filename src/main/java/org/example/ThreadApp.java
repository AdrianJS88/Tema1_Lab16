package org.example;

import java.util.Scanner;

import static org.example.FindIndex.findIndex;

public class ThreadApp implements Runnable  {

    // Driver Code
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter a number to find the index:");
        int[] my_array = {5, 4, 6, 1, 3, 2, 7, 8, 9, 45, 32, 48, 69, 4845, 84, 48, 69, 14, 48, 656};
        int[] my_array2 = {54, 64, 86, 81, 3, 23, 71, 8, 49, 45, 32, 448, 694, 4845, 284, 48, 69, 314, 648, 956};
        int sc = new Scanner(System.in).nextInt();


        //create 5 search threads
        for (int i = 0; i < 3; i++) {

            Thread thread = new Thread(new ThreadApp());
            thread.start();
        }
        // find the index
        System.out.println("Index position in first array is: "
                + findIndex(my_array, sc));
        System.out.println("Index position in second array is: "
                + findIndex(my_array2, sc));
    }


    @Override
    public void run() {
        System.out.println("Searching index " + Thread.currentThread());
        System.out.println( Thread.currentThread()+"Search complete:" );
        System.out.println("  ");
    }
}
