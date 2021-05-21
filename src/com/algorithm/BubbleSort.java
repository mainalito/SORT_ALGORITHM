package com.algorithm;

import java.util.Scanner;

public class BubbleSort
{
    final static int total_students = 100;
    final static String[] names = new String[total_students];
    //methods
    void Descendingbubblesort(int[] copy)
    {
        int total_students = copy.length;
        for (int i = 0; i < total_students - 1; i++)
        {
            //inner loop is for comparisions
            for (int j = 0; j < total_students - 1; j++)
            {
                if (copy[j] < copy[j + 1])
                {
                    //we are swapping
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }

            }

        }
    }

    void ascendingbubblesort(int[] total_marks)
    {
        //ascending order
        //int i is the outer loop (passes)
        int total_students = total_marks.length;
        for (int i = 0; i < total_students - 1; i++)
        {
            //inner loop is for comparisions
            for (int j = 0; j < total_students - 1; j++)
            {
                if (total_marks[j] > total_marks[j + 1])
                {
                    //we are swapping
                    int temp = total_marks[j];
                    total_marks[j] = total_marks[j + 1];
                    total_marks[j + 1] = temp;
                }

            }

        }
    }

    void printAscending(int[] total_marks)
    {
        System.out.println("==================ASCENDING ORDER========================");
        for (int i = 0; i < total_students; i++)
        {
            System.out.println("\t\t\t"
                    + total_marks[i]);
        }
    }

    void printDescending(int[] copy)
    {
        System.out.println("==================DESCENDING ORDER========================");
        for (int i = 0; i < total_students; i++)
        {
            System.out.println("\t\t\t"
                    + copy[i]);
        }
    }
    void print(int [] beforeSort)
    {
        System.out.println("=======================BEFORE SORTING ======================");
        for (int i = 0; i < total_students; i++)
        {
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
        int[] total_marks = new int[total_students];
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

        BubbleSort ar = new BubbleSort();
        ar.print(beforeSort);
        System.out.println();
        ar.Descendingbubblesort(copy);
        ar.ascendingbubblesort(total_marks);
        System.out.println();
        ar.printAscending(total_marks);
        ar.printDescending(copy);
    }

}

