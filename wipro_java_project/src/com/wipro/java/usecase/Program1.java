package com.wipro.java.usecase;

import java.util.Scanner;

public class Program1 {

	public static int countPairs(int N, int[] A) {
        int count = 0;

        // Iterating through possible pairs(i,j)
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int minHeight = Math.min(A[i], A[j]);
                boolean validPair = true;

                // Check all elements between A[i] and A[j]
                for (int k = i + 1; k < j; k++) {
                    if (A[k] >= minHeight) {
                        validPair = false;
                        break;
                    }
                }

                if (validPair) {
                    count++;
                }
            }
        }
        return count;
    }

    // Non-editable main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] A = new int[N];
        String[] temp = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(temp[i]);
        }
        System.out.println(countPairs(N, A));
        scanner.close();
    }

}
