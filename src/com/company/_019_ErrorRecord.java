package com.company;

/**
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。

 处理：

 1、 记录最多8条错误记录，循环记录，对相同的错误记录（净文件名称和行号完全匹配）只记录一条，错误计数增加；

 2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；

 3、 输入的文件可能带路径，记录文件名称不能带路径。


 输入描述:
 一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。


 输出描述:
 将所有的记录统计并将结果输出，格式：文件名 代码行数 数目，一个空格隔开，如：

 输入例子:
 E:\V1R2\product\fpgadrive.c 1325

 输出例子:
 fpgadrive.c 1325 1
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _019_ErrorRecord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        while (input.hasNextLine()) {
            String inf = input.nextLine();
            if (inf.equals(""))
                break;
            int flag = inf.lastIndexOf("\\")+1;
            inf = inf.substring(flag);
            if (!list.contains(inf)) {
                list.add(inf);
            }
            if (map.containsKey(inf)) {
                map.put(inf, map.get(inf) + 1);
            } else {
                map.put(inf, 1);
            }
        }

        for (int i = Math.max(0, list.size() - 8); i < list.size(); i++) {
            String temp = list.get(i);
            String first = temp.substring(0, temp.indexOf(' '));
            if (first.length() > 16)
                first = first.substring(first.length() - 16);
            String second = temp.substring(temp.lastIndexOf(' ') + 1);
            System.out.println(first + " " + second + " " + map.get(list.get(i)));
        }

        input.close();
    }
}