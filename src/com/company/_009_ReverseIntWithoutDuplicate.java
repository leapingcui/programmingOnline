package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 输入例子:
 9876673
 输出例子:
 37689
 */
public class _009_ReverseIntWithoutDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anInt = Integer.parseInt(sc.nextLine());
        String str = reverseWithoutDuplicate(anInt);
        System.out.println(str);
    }

    private static String reverseWithoutDuplicate(int anInt) {
        char[] chars = String.valueOf(anInt).toCharArray();
        //利用LinkedHashSet  不可重复，有序的特点
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = chars.length - 1; i >= 0; i--) {
            set.add(chars[i]);
        }
        String result = "";
        for (Character c : set) {
            result = result + c;
        }
        return result;
    }

}
