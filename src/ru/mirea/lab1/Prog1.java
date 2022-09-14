package ru.mirea.lab1;
import java.util.Scanner;

public class Prog1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Введите число: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        float avg = sum/5f;
        System.out.print("Среднее арифметическое = ");
        System.out.println(avg);
    }
}
