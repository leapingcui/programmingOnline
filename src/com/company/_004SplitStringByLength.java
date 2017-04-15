package com.company;

import java.util.Scanner;

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 输入例子:
 abc
 123456789
 输出例子:
 abc00000
 12345678
 90000000
 */
public class _004SplitStringByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 2 && sc.hasNext()) {         //控制输入两次字符串后程序停止
            String s = sc.nextLine();
            if ( s.length() >= 100) {
                return;
            }
            splitStringByLength(s);
            i++;
        }

    }

    private static void splitStringByLength(String s) {
        while (s.length() > 8) {
            System.out.println(s.substring(0,8));
            s = s.substring(8);
        }
        if (s.length() < 8 && s.length() > 0) {
            s = s + "00000000";
            System.out.println(s.substring(0,8));
        }

    }

}
