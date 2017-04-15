package com.company;

import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 得到字符串最后一个单词的长度
 */
public class _001GetLastWordLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getLastWordLength(str));

    }

    private static int getLastWordLength(String str) {
        String word = str.substring(str.lastIndexOf(" ") + 1);
        return word.length();
    }

}
