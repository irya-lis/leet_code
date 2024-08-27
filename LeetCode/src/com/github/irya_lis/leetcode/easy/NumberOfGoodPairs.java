package com.github.irya_lis.leetcode.easy;

import java.util.Arrays;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};

        System.out.println(numIdenticalPairs(ints));
    }

    public static int numIdenticalPairs(int[] nums) {
        short result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    result++;
                }
            }
        }
        return result;
    }
}
