package ru.mirea.lab1;

public class factorial
{
    public static int factor(int a)
    {
        int sum = 1;
        for (int i = 1; i <= a; i++)
        {
            sum *= i;
        }
        return sum;
    }
}
