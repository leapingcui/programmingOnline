package com.company;

import java.util.Scanner;

/**
 * 密码要求:



 1.长度超过8位



 2.包括大小写字母.数字.其它符号,以上四种至少三种



 3.不能有相同长度超2的子串重复



 说明:长度超过2的子串


 输入描述:
 一组或多组长度超过2的子符串。每组占一行


 输出描述:
 如果符合要求输出：OK，否则输出NG

 输入例子:
 021Abc9000
 021Abc9Abc1
 021ABC9000
 021$bc9000

 输出例子:
 OK
 NG
 NG
 OK
 */
public class _020_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            int[] cla={0,0,0,0};
            if(str.length()<9||str==null)
                System.out.println("NG");
            else{
                for(int i=0;i<str.length();i++){
                    char ch=str.charAt(i);
                    if(ch>='0'&&ch<='9'){
                        cla[0]=1;
                    }else if(ch>='a'&&ch<='z'){
                        cla[1]=1;
                    }else if(ch>='A'&&ch<='Z'){
                        cla[2]=1;
                    }else{
                        cla[3]=1;
                    }
                }
                if(cla[0]+cla[1]+cla[2]+cla[3]<3){
                    System.out.println("NG");
                }else{
                    System.out.println(isHasSubString(str));
                }
            }
        }
    }
    private static String isHasSubString(String str) {
        for (int i = 0; i < str.length() -3; i++) {
            String str1=str.substring(i,i+3);
            String str2=str.substring(i+3, str.length());
            if(str2.contains(str1))
                return "NG";
        }
        return "OK";
    }
}