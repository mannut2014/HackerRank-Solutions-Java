package main.java.com.hackerrank.algorithms.bit_manipulation;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/lonely-integer
 * There are N integers in an array A. All but one integer occur in pairs.
 * Your task is to find the number that occurs only once.
 * <p>
 * Difficulty: easy
 */
public class LonelyInteger
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++)
        {
            int digit = scanner.nextInt();
            if (!hashSet.add(digit))
            {
                hashSet.remove(digit);
            }
        }
        System.out.println(hashSet.iterator().next());
    }
}
