package com.company;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */
public class _007_GetApproximateValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float v = sc.nextFloat();
        int round = Math.round(v);
        System.out.println(round);
    }

}
