package com.company;

import java.util.Scanner;

/**
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class _011_ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(getResult(num));
    }

    private static String getResult(String num) {
        StringBuffer sb = new StringBuffer();
        char[] chars = num.toCharArray();
        for (int i = chars.length - 1; i >= 0 ; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
