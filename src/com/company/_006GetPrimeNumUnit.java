package com.company;

import java.util.Scanner;

/**
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 最后一个数后面也要有空格
 */
public class _006GetPrimeNumUnit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (num < 2) {
            return;
        } else if (num == 2) {
            System.out.println(num + " ");
        } else {
            String result = getResult(num);
            System.out.println(result);
        }

    }

    private static String getResult(long ulDataInput) {
        StringBuffer sb = new StringBuffer();
        int index = 2;
        while (index <= ulDataInput) {
            if (ulDataInput % index == 0) {
                sb.append(index).append(" ");
                ulDataInput = ulDataInput / index;
            } else {
                index++;
            }
        }
        return sb.toString();
    }

}
