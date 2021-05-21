package com.algorithm;

public class SelectionExample
{
    public static void main(String[] args)
    {


        int [] A ={7,4,10,8,3,1,-1,434,-90};
        int size = A.length; //size is 6
        //first we need to find the minimum element in unsorted subarray
        //the minimum element is 1, so we will swap it with 7 the first element which is unsorted subarray
        /*
        * pass1 = {1,4,10,8,3,7} so 1 is sorted subarray..hence we will not sort previously sorted elements which is 1
        * pass2 = we will sort 4 and 3 ===> {1,3,10,8,4,7}
        * pass3 = {1,3,4,8,10,7}
        * pass4 = {1,3,4,7,10,8}
        * pass5 = {1,3,4,7,8,10}
        * */
        for (int i =0;i<size-1;i++)
        //this outerloop will be for passess
            {
                int min = i; //we are initializing the first element as minimum value
                for (int j=i+1;j<size;j++)
                {
                    if (A[j] < A[min])
                    {
                        min = j;
                    }
                }
                if (min!=i)
                {
                    int temp = A[i];
                    A[i]= A[min];
                    A[min]= temp;
                }
            }
        for (int j : A)
        {
            System.out.println(j);
        }

    }
}
