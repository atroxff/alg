package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/8
 *
 * 输入M，N，M代表马路的长度，N代表区域的数目，M和N之间用一个空格隔开
 * 依次输入区域
 */
public class RoadRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] road = new int[m];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            for (int j = a-1; j <= b-1; j++) {
                road[j]=1;
            }
        }
        int num = road.length+1;
        for (int i : road) {
            if (i == 1) {
                num--;
            }
        }
        System.out.println(num);

    }
}
