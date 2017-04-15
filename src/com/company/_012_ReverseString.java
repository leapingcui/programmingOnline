package com.company;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。
 * 输入例子:
 abcd

 输出例子:
 dcba
 */
public class _012_ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getResult(str));
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
