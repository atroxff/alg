package cn.ff.alg.algbasetest.difficult;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** ???
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 *
 * 输入
 * 输入数据有多组。每组数据的第一行为以正整数n (0＜n＜100000)，表示有n个金币掉在屏幕上上。在结下来的n行中，每行有两个整数x,T (0＜T＜100000),表示在第T秒有一个金币掉在x点上。同一秒钟在同一点上可能掉下多个金币。n=0时输入结束。输入数据以空格隔开
 */
public class JieJinBi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, int[]> map = new HashMap<>();
        int maxT = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int t = in.nextInt();
            if (!map.containsKey(t)) {
                map.put(t, new int[11]);
            }
            map.get(t)[x] = 1;//表示t时间落金币的位置
            maxT = Math.max(t, maxT);
        }
        sum(map, maxT);
    }

    private static int sum(Map<Integer,int[]> map, int max) {
        int result = 0;
        boolean[] pos = new boolean[11];
        pos[5] = true;
        int[] res = new int[11];
        for (int i = 1; i <= max; i++) {
            boolean[] newpos = new boolean[11];
            int[] newres = new int[11];
            for (int j = 0; j < 11; j++) {
                if (pos[j]) {
                    for (int k = j > 0 ? j - 1 : 0; k <= (j < 10 ? j + 1 : 10); k++) {
                        newpos[k] = true;
                        int[] v = map.get(i);
                        if (v == null)
                            v = new int[11];
                        int value = res[j] + v[k];
                        if (value > newres[k])
                            newres[k] = value;
                    }
                }
            }
            // for (int j = 0; j < 11; j++) {
            // System.out.print(newres[j] + " ");
            // }
            // System.out.println();
            pos = newpos;
            res = newres;
        }
        for (int i = 0; i < 11; i++) {
            if (res[i] > result)
                result = res[i];
        }
        return result;
    }
}
