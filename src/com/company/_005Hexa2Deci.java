package com.company;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * 输入一个十六进制的数值字符串。0xA
 * 输出该数值的十进制字符串。10
 *
 *
 * 十进制转成十六进制：

 Integer.toHexString(int i)

 十进制转成八进制

 Integer.toOctalString(int i)

 十进制转成二进制

 Integer.toBinaryString(int i)

 ###########################################################

 直接将2,8,16进制直接转换为10进制

 java.lang.Integer类

 parseInt(String s, int radix)

 使用第二个参数指定的基数，将字符串参数解析为有符号的整数。


 Integer.parseInt("473", 10) returns 473

 Integer.parseInt("-FF", 16) returns -255

 Integer.parseInt("1100110", 2) returns 102
 */
public class _005Hexa2Deci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next().substring(2);
            System.out.println(Integer.parseInt(str,16));
        }

    }

}
