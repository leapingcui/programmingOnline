package com.company;


import java.util.Arrays;

/**
 * 演示Arrays的sort方法
 */
public class _000a_ArraysSort {

    public static void main(String[] args) {

        int[] nums = {4,7,1,3,2,9,6};
        for (int i = 0;i < nums.length;i++) {
            System.out.print(nums[i] +",");
        }
        //整形数组按升序排列
        Arrays.sort(nums);
        System.out.println();
        for (int i = 0;i < nums.length;i++) {
            System.out.print(nums[i] +",");
        }
        System.out.println();
        String[] strs = {"hello","hii","abc","jack","jeck","cuiyue"};
        for (int i = 0;i < strs.length;i++) {
            System.out.print(strs[i] +",");
        }
        Arrays.sort(strs);
        System.out.println();
        for (int i = 0;i < strs.length;i++) {
            System.out.print(strs[i] +",");
        }

    }

}
