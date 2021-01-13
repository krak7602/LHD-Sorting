package com.krak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrInsertion = {4, 3, 5, 7, 2};
        int[] arrBubble = {4, 3, 5, 7, 2};
        int[] arrSelection = {4, 3, 5, 7, 2};
        System.out.println("Checking insertion sort:");
        insertion(arrInsertion);
        System.out.println(Arrays.toString(arrInsertion));
        System.out.println("\nChecking bubble sort:");
        bubble(arrBubble);
        System.out.println(Arrays.toString(arrBubble));
        System.out.println("\nChecking selection sort:");
        selection(arrSelection);
        System.out.println(Arrays.toString(arrSelection));
    }


    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
    }

    public static void selection(int[] nums) {
        for (int i = 0;i < nums.length; i++) {
            int last = nums.length - i - 1;
            int max = max_limit(nums, last);
            swap(nums, max, last);
        }
    }

    private static int max_limit(int[] nums, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void insertion(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j-1, j);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}