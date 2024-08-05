package com.github.irya_lis.leetcode.easy;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};


        System.out.println(Arrays.toString(getConcatenation(ints)));
    }


    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }

        return result;
    }
}