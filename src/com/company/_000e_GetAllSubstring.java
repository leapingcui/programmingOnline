package com.company;

import java.util.Scanner;
/**
 * 比如序列{1,2,3,4,5}，给定的除数为5，其中满足条件的子串{5}、{2，3}、{1,2,3,4}、{1,2,3,4,5}，所以答案是5，因为最大子串是{1,2,3,4,5}，长度为5
 * 输入：
 * 5     （输入N个整数）
 * 1 2 3 4 5
 * 5      （除数）
 * 输出：
 * 5
 *
 * 输入：
 * 6
 * 3 1 2 7 7 7
 * 4
 * 输出：
 * 5
 *
 * 思路：
 * 先得到一个字符串的所有的连续子串（字符串数组）
 * 遍历字符串数组，对每一个字符串求和并判断
 */
public class _000e_GetAllSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        String str = sc.nextLine();
        //去掉字符串中的空格
        String s = str.replaceAll("\\s+", "");
        String[] list = getAllSubstring(s);
        int K = sc.nextInt();
        int len = getResult(list,K);
        System.out.println(len);
    }

    //得到一个字符串的所有的连续子串
    private static String[] getAllSubstring(String s) {
        StringBuffer sb = new StringBuffer();
        for (int k = 0; k < s.length(); k++) {
            for (int i = 0; i < s.length() - k; i++) {
                for (int j = i; j < i + k + 1; j++) {
                    sb.append(String.valueOf(s.charAt(j)));
                }
                sb.append(" ");
            }
        }
        String[] strs = sb.toString().split("\\s+");
        return strs;
    }

    private static int getResult(String[] list,int K) {
        int len = 0;
        for (String subString : list) {
            int sum = string2intSum(subString);
            if (sum % K == 0) {
                len = subString.length();
            }
        }
        return len;
    }

    //将数字字符串每个字符求和
    private static int string2intSum(String str) {
        int sum = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            sum += Integer.valueOf(String.valueOf(chars[i]));
        }
        return sum;
    }

}
