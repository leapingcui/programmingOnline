package com.company;

import java.util.Scanner;

/**
 * 一瓶汽水A块钱（A为正数），B个空瓶可以换一瓶汽水，小明有N（N为正数）块钱，问小明最多可以和多少瓶汽水，最后剩几个瓶子？
 * 分两种情况，一是允许借了再还，二是不允许借
 * 例如：
 * 一瓶汽水1块钱，3个空瓶可以换一瓶汽水，小明有10块钱，允许借的情况下能喝15瓶，不剩空瓶子；不允许借的情况下，能喝14瓶，
 * 剩2个空瓶子
 */
public class _004e_GetWaterByMoney {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strings = str.split("\\s+");
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }

        int[] result = getResult(nums[0], nums[1], nums[2],nums[3]);
        System.out.println(result[0] + "," + result[1]);
    }

    /**
     * @param a 是一瓶汽水几块钱，如 1
     * @param b 是几个空瓶可以换一瓶汽水，如 3
     * @param n 是共有几块钱，如 10
     * @param flag 是标志位，0表示不允许借，1表示允许借了再还
     * @return
     */
    private static int[] getResult(int a, int b, int n, Integer flag) {
        if (flag == null) flag = 0;     //设置默认值
        double bv = a / b;              //单是一个空瓶的价值
        double wv = a * (b-1) / b;      //单是里面的汽水的价值
//        double bv = 0.33333333;              //单是一个空瓶的价值
//        double wv = 0.66666666;      //单是里面的汽水的价值
        System.out.println("空瓶价值" + bv);
        System.out.println("水价值" + wv);
        if (flag == 0) {
            //不允许借
            double v1 = n / wv;
            double v2 = n % wv;
            if (v2 == 0) {
                return new int[]{(int) (v1 - 1), b-1};
            } else {
                return new int[]{(int)v1, (int)((n - v1 * wv) / bv)};
            }

        } else {
            //允许借了再还
            double v1 = n / wv;
            double v2 = n % wv;
            if (v2 == 0) {
                return new int[]{(int)v1, 0};
            } else {
                return new int[]{(int)v1, (int)((n - v1 * wv) / bv)};
            }
        }
    }



}
