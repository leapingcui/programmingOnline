package com.company;
import java.util.Scanner;

/**
 * 请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。

 所有的IP地址划分为 A,B,C,D,E五类

 A类地址1.0.0.0~126.255.255.255;

 B类地址128.0.0.0~191.255.255.255;

 C类地址192.0.0.0~223.255.255.255;

 D类地址224.0.0.0~239.255.255.255；

 E类地址240.0.0.0~255.255.255.255



 私网IP范围是：

 10.0.0.0～10.255.255.255

 172.16.0.0～172.31.255.255

 192.168.0.0～192.168.255.255



 子网掩码为前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
 本题暂时默认以0开头的IP地址是合法的，比如0.1.1.2，是合法地址


 输入描述:
 多行字符串。每行一个IP地址和掩码，用~隔开。


 输出描述:
 统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开。

 输入例子:
 10.70.44.68~255.254.255.0
 1.0.0.1~255.0.0.0
 192.168.0.2~255.255.255.0
 19..0.~255.255.255.0
 输出例子:
 1 0 1 0 0 2 1
 */
public class _018_IPAddress {
    private static int[] num = new int[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strIP = new String[1];

        while (sc.hasNext()) {
            strIP[0] = sc.nextLine();
            count(strIP);
        }
        for (int i = 0; i < 7; i++) {
            if (i == 6)
                System.out.println(num[i]);
            else
                System.out.print(num[i] + " ");
        }
        sc.close();

        // String[] strIP = { "10.70.44.68~255.254.255.0", "1.0.0.1~255.0.0.0",
        // "192.168.0.2~255.255.255.0", "19..0.~255.255.255.0" };
        // count(strIP);
        // for (int i : num) {
        // System.out.print(i + " ");
        // }

    }

    public static void count(String[] strIP) {
        String[] str = new String[2];// ~前后的字符串
        int[] ipInt = new int[4];
        int[] maskIpInt = new int[4];
        long mask = 0;
        for (int i = 0; i < strIP.length; i++) {
            str = strIP[i].split("~");
            String[] ip = str[0].split("\\.");
            String[] maskIp = str[1].split("\\.");

            if (ip.length < 4 || maskIp.length < 4) {
                num[5]++;
                continue;
            }

            for (int k = 0; k < 4; k++) {
                if ("".equals(ip[k]) || "".equals(maskIp[k])
                        || " ".equals(ip[k]) || " ".equals(maskIp[k])) {
                    num[5]++;
                    break;
                }
            }

            for (int j = 0; j < 4; j++) {
                ipInt[j] = Integer.parseInt(ip[j]);
                maskIpInt[j] = Integer.parseInt(maskIp[j]);
                if (ipInt[j] < 0 || ipInt[j] > 255 || maskIpInt[j] < 0
                        || maskIpInt[j] > 255) {
                    num[5]++;
                    break;
                }
            }

            if (maskIpInt[0] == 255 && maskIpInt[1] == 255
                    && maskIpInt[2] == 255 && maskIpInt[3] == 255) {
                num[5]++;
                continue;
            }

            mask = maskIpInt[0] * (0xffffff + 1l) + maskIpInt[1]
                    * (0xffff + 1l) + maskIpInt[2] * (0xff + 1l) + maskIpInt[3];

            if (((mask - 1l) | mask) != 0xffffffffl) {
                num[5]++;// 判断子网掩码合法性
                continue;
            }

            if ((ipInt[0] == 10)
                    || (ipInt[0] == 172 && ipInt[1] >= 16 && ipInt[1] <= 31)
                    || (ipInt[0] == 192 && ipInt[1] == 168)) {
                num[6]++;
                // continue;
            }
            if (ipInt[0] >= 1 && ipInt[0] <= 126)
                num[0]++;
            if (ipInt[0] >= 128 && ipInt[0] <= 191)
                num[1]++;
            if (ipInt[0] >= 192 && ipInt[0] <= 223)
                num[2]++;
            if (ipInt[0] >= 224 && ipInt[0] <= 239)
                num[3]++;
            if (ipInt[0] >= 240 && ipInt[0] <= 255)
                num[4]++;
        }

    }
}

