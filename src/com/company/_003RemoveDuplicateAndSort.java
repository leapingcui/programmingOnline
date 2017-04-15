package com.company;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
 * 按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 *
 * 输入多行，先输入随机整数的个数，再输入相应个数的整数
 *   输入例子:
 11
 10
 20
 40
 32
 67
 40
 20
 89
 300
 400
 15
 输出例子:
 10
 15
 20
 32
 40
 67
 89
 300
 400
 */
public class _003RemoveDuplicateAndSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] ints = new int[n];
            for (int i = 0;i < n;i++) {
                ints[i] = sc.nextInt();
            }
            TreeSet nums = getNums(ints);
            for (Object i : nums) {
                System.out.println((Integer)i);
            }
        }

    }

    private static TreeSet getNums(int[] ints) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0;i < ints.length;i++) {
            ts.add(ints[i]);
        }
        return ts;
    }


}
