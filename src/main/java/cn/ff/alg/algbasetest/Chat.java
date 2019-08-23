package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/7
 *
 * 小明空闲时间是[a1, b1], [a2, b2], …, [ap, bp]；
 * 而小红的时间是依赖她起床时间t，是[c1+t, d1+t], [c2+t, d2+t], …, [cq+t, dq+t]；
 * 边界点也是空闲时间。小红起床时间t为[l, r]之间的任意一个整点时刻（也包括边界），
 * 只要两人能在任一时刻同时在线进行聊天，那么t就是小红合适的起床时间。
 * 询问小红能够有多少个合适的起床时间
 */
public class Chat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int a[][] = new int[p][2];
        int b[][] = new int[q][2];
        for (int i = 0; i < p; i++) {
            a[i][0] = in.nextInt();
            a[i][1] = in.nextInt();
        }
        for (int i = 0; i < q; i++) {
            b[i][0] = in.nextInt();
            b[i][1] = in.nextInt();
        }
        System.out.println(findTime(a, b, l, r));
    }

    private static int findTime(int[][] a, int[][] b, int l, int r) {
        int c = 0;
        boolean find = false;
        for (int t = l; t <= r; t++) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    int bl = b[j][0] + t;
                    int br = b[j][1] + t;
                    if (!(bl > a[i][1] || br < a[i][0])) {
                        c++;
                        find = true;
                        break;
                    }
                }
                if (find)
                    break;
            }
            if (find) {
                find = false;
                continue;
            }
        }
        return c;
    }
}
