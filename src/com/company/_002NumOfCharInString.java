package com.company;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * 输出输入字符串中含有输入字符的个数
 * 输入：ABCDEF
 *      A
 * 输出：1
 */
public class _002NumOfCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        System.out.println(getNum(str, s));

    }

    private static int getNum(String str, String s) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0;i < chars.length;i++) {
            if (s.equalsIgnoreCase(String.valueOf(chars[i]))) {
                count++;
            }
        }
        return count;
    }

}
