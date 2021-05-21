package com.algorithm;

public class Main {

    public static void main(String[] args) {
        //ascending order
        int [] A = new int[100];
        //the size of the array is 5 which is n
        //in bubble sort the A[i] and A[i+1] are compared
        //if there are in wrong order we swap
        //the largest element bubbles up to the last position
        // we need to sort n -1 times since the last element bubbles automatically
        //there will be 2 loops
        //one for passes and one for comparisions(inner loop)

        //this is the no of elements
        //there will n-1 passes

        System.out.println("size " + A.length);

        for (int j : A)
        {
            System.out.print("Array: " + j + " " + "\n");
        }
        System.out.println("=======================");
        int temp;
        int n = A.length;

        //int i is the outer loop (passes)
        for (int i = 0; i < n - 1; i++)
        {
            //inner loop is for comparisions
            for (int j = 0; j <n-1;j++)
            {
                if (A[j] > A[j+1])
                {
                    //we are swapping
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }

            }

        }
        for (int j : A) {
            System.out.println("\t\t" + j);
        }

    }
}
