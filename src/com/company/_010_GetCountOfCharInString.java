package com.company;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。
 * 输入例子:
 abc
 输出例子:
 3
 */
public class _010_GetCountOfCharInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = getCount(str);
        System.out.println(num);
    }

    private static int getCount(String str) {
        HashSet<Character> set = new HashSet<>();
        for (Character c : str.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }


}
