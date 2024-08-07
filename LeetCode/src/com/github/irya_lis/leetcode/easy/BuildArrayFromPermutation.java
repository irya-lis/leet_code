package com.github.irya_lis.leetcode.easy;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] ints = {0, 2, 1, 5, 3, 4};


        System.out.println(Arrays.toString(buildArray(ints)));
    }

    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
