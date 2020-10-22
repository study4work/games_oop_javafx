package ru.job4j;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < rsl.length) {
            if (i > left.length - 1) {
                int a = right[j];
                rsl[k] = a;
                j++;
            } else if (j > right.length - 1) {
                int a = left[i];
                rsl[k] = a;
                i++;
            } else if (left[i] < right[j]) {
                int a = left[i];
                rsl[k] = a;
                i++;
            } else {
                int b = right[j];
                rsl[k] = b;
                j++;
            }
            k++;
        }

            return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}