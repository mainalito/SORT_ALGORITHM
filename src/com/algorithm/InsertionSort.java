package com.algorithm;

import java.util.Scanner;

public class InsertionSort {

    final static int total_students = 100;
    final static String[] names = new String[total_students];
    final static int[] total_marks = new int[total_students];
    void AscendingInsertionSelectionSort() {
        for (int i = 1; i < total_students; i++) {
            int temp = InsertionSort.total_marks[i]; //stores the value
            int j =i-1;
            //comparision
            while(j>=0 && InsertionSort.total_marks[j]>temp){
                InsertionSort.total_marks[j+1]= InsertionSort.total_marks[j]; //the right value is to assigned to the left value
                j--;
            }
            InsertionSort.total_marks[j+1]= temp;

        }

    }
    void descendingInsertionSelectionSort(int[] copy) {
        for (int i = 1; i < total_students; i++) {
            int temp = copy[i]; //stores the value
            int j =i-1;
            //comparision
            while(j>=0 && copy[j]<temp){
                copy[j+1]=copy[j]; //the right value is to assigned to the left value
                j--;
            }
            copy[j+1]= temp;

        }

    }
    void printAscending() {
        System.out.println("==================ASCENDING ORDER========================");
        for (int i = 0; i < total_students; i++) {
            System.out.println("\t\t\t"
                    + InsertionSort.total_marks[i]);
        }
    }

    void printDescending(int[] copy) {
        System.out.println("==================DESCENDING ORDER========================");
        for (int i = 0; i < total_students; i++) {
            System.out.println("\t\t\t"
                    + copy[i]);
        }
    }
    void print(int [] beforeSort){
        System.out.println("=======================BEFORE SORTING ======================");
        for (int i = 0; i < total_students; i++) {
            System.out.println("\t\t\t"
                    + beforeSort[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        //subjects 4
        int[] s1 = new int[total_students];
        int[] s2 = new int[total_students];
        int[] s3 = new int[total_students];
        int[] s4 = new int[total_students];

        int[] copy = new int[total_students];
        int[] beforeSort = new int[total_students];

        for (int i = 0; i < total_students; i++)
        {
            System.out.println("enter student " + (i + 1) + " details");

            System.out.println("Name: ");
            obj.nextLine();
            names[i] = obj.nextLine();
            System.out.println("Course CCS201 marks: ");
            s1[i] = obj.nextInt();
            System.out.println("Course CCS202 marks: ");
            s2[i] = obj.nextInt();
            System.out.println("Course CCS203 marks : ");
            s3[i] = obj.nextInt();
            System.out.println("Course CCS204 marks: ");
            s4[i] = obj.nextInt();

            //total marks
            total_marks[i] = s1[i] + s2[i] + s3[i] + s4[i];
            System.out.println();

        }
        //descending order
        //first copy the array in another array
        System.arraycopy(total_marks, 0, copy, 0, total_students);
        System.arraycopy(total_marks,0,beforeSort,0,total_students);


        InsertionSort i = new InsertionSort();
        i.print(beforeSort);
        System.out.println();
        i.AscendingInsertionSelectionSort();
        i.descendingInsertionSelectionSort(copy);
        i.printAscending();
        System.out.println();
        i.printDescending(copy);



    }
}
