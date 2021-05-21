package com.algorithm;

public class ShellsortExampl {
    public static void main(String[] args){
        int [] A= {23,29,15,19,31,7,9,5,2};
        //shell sort we compare distant elements
        //we need to find gap which is gap = N/2
        //this involves few shift operations

        int size = A.length;
        for(  int gap =size/2; gap>1; gap/=2 )
        {
            for(int j = gap ; j<size ;j++)
            {
                for(int i = j -gap; i >= 0; i = i - gap)
                {
                    if(A[i+gap] > A[i])
                    {
                        break;
                    }
                    else
                        {
                        int temp = A[i+gap];
                        A[i+gap] = A[i];
                        A[i] = temp;
                    }
                }
            }
        }
        System.out.println("array size : " + size/2);
        for (int j : A) {
            System.out.println(j);
        }
    }
}
