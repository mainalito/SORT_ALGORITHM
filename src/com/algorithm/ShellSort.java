package com.algorithm;

import java.util.Scanner;

public class ShellSort {
    final static int total_students = 4;
    final static String[] names = new String[total_students];
    final static int[] total_marks = new int[total_students];

    void AscendingShellSort(int total_marks[]) {
        for(  int gap =total_students/2; gap>1; gap/=2 )
        {
            for(int j = gap ; j<total_students ;j++)
            {
                for(int i = j -gap; i >= 0; i = i - gap)
                {
                    if(total_marks[i+gap] > total_marks[i])
                    {
                        break;
                    }
                    else
                    {
                        int temp = total_marks[i+gap];
                        total_marks[i+gap] = total_marks[i];
                        total_marks[i] = temp;
                    }
                }
            }
        }

    }
    void descendingShellSort(int[] copy) {
        for(  int gap =total_students/2; gap>1; gap/=2 )
        {
            for(int j = gap ; j<total_students ;j++)
            {
                for(int i = j -gap; i >= 0; i = i - gap)
                {
                    if(copy[i+gap] < copy[i])
                    {
                        break;
                    }
                    else
                    {
                        int temp = copy[i+gap];
                        copy[i+gap] = copy[i];
                        copy[i] = temp;
                    }
                }
            }
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


        ShellSort i = new ShellSort();
        i.print(beforeSort);
        System.out.println();
        i.AscendingShellSort(total_marks);
        i.descendingShellSort(copy);
        i.printAscending();
        System.out.println();
        i.printDescending(copy);



    }
}
