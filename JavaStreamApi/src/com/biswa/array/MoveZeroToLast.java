package com.biswa.array;

import java.util.Arrays;

public class MoveZeroToLast {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 4, 3, 0, 5, 8};
        int index = 0;

        //Move all non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        System.out.println(Arrays.toString(arr));
        // Fill the remaining positions with 0
        while (index < arr.length) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
