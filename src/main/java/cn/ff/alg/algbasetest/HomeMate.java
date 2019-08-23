package cn.ff.alg.algbasetest;

import java.util.*;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 *
 * 认老乡
 */
public class HomeMate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            if (n == 0 && m == 0) {
               break;
            }
            int[] value = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                value[i] = i;
            }
            for (int i = 0; i < m; i++) { //value数组 同乡人同值
                int a = in.nextInt();
                int b = in.nextInt();
                int tmp = value[b];
                for (int j = 1; j <value.length; j++) {
                    if (value[j] == tmp) value[j] = value[a];
                }
            }
            int result = -1;
            for (int i = 1; i < value.length; i++) {
                if(value[i]==value[1]) result++;
            }
            System.out.println(result);

        }
        in.close();

    }
}
