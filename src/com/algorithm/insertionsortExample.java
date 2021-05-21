package com.algorithm;

public class insertionsortExample {


    //we have sorted sublist and unsorted sublist
    //we start we the first value from unsorted sublist and find appropriate place in sorted sublist
    //by default we take A[0] which is already sorted
    //the unsorted sublist starts from A[1]
    //store the first value in unsorted sublist in a temp variable
    //compare the value with values in sorted sublist
    //if its greater than the value then shift the value to its right
  public static void main(String[] args)
  {
      int[] A ={5,4,10,1,6};
      int size = A.length;
      for (int i = 1; i < size; i++) {
        int temp = A[i]; //stores the value
        int j =i-1;
        //comparision
          while(j>=0 && A[j]>temp){
              A[j+1]=A[j]; //the right value is to assigned to the left value
              j--;
          }
          A[j+1]= temp;

      }

      for (int i : A) {
          System.out.println(i);

      }
}}
