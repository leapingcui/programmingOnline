package com.company;

import java.util.Scanner;

/**
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。

 输入描述:
 输入一个整数（int类型）


 输出描述:
 这个数转换成2进制后，输出1的个数

 输入例子:
 5

 输出例子:
 2
 */
public class _015_Deci2Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(getResult(num));

    }

    private static int getResult(int num) {
        int count = 0;
        char[] chars = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                count++;
            }
        }
        return count;
    }

}
