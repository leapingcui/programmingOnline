package com.company;

import java.util.Scanner;

/**
 * 2017-03-22华为实习岗机试第一题，反转相加
 */
public class _000b_ReverseAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strings = str.split(",");
            int num1 = Integer.parseInt(strings[0]);
            int num2 = Integer.parseInt(strings[1]);
            if (num1<1 || num1>7000 || num2<1 || num2>7000) {
                System.out.println(-1);
                continue;
            }
            int int1 = reverseInt(num1);
            int int2 = reverseInt(num2);
            int sum = reverseAdd(int1, int2);
            System.out.println(sum);
        }

    }

    private static int reverseAdd(int num1, int num2) {
        return num1 + num2;
    }

    private static int reverseInt(int num) {
        StringBuffer sb = new StringBuffer();
        String string = String.valueOf(num);
        char[] chars = string.toCharArray();
        for (int i = 0;i < chars.length;i++) {
            if (chars[i] != '0') {
                sb.append(chars[i]);
            }
        }
        return Integer.parseInt(sb.reverse().toString());
    }


}
