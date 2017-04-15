package com.company;

import java.util.Scanner;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class _013_ReverseSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getResult(str));
    }

    private static String getResult(String str) {
        StringBuffer sb = new StringBuffer();
        String[] strings = str.split(" ");
        for (int i = strings.length - 1; i >= 0 ; i--) {
            if (i != 0) {
                sb.append(strings[i]).append(" ");
            } else {
                sb.append(strings[i]);
            }
        }

        return sb.toString();
    }

}
