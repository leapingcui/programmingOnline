package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * 输入例子:
 4
 0 1
 0 2
 1 2
 3 4
 输出例子:
 0 3
 1 2
 3 4
 */
public class _008_MergeMultiKeyVal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0;i < n;i++) {
            String[] strings = sc.nextLine().split("\\s+");
            mergeKeyVal(map, strings);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

    private static void mergeKeyVal(TreeMap<Integer, Integer> map, String[] strings) {
        int key = Integer.parseInt(strings[0]);
        int val = Integer.parseInt(strings[1]);
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + val);
        } else {
            map.put(key, val);
        }

    }


}
