package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/7
 *
 * 乘车时必须按照班级排列顺序进行乘车，不能调整班级顺序进行拼车。
 * 为保证同一个班级的学生在同一辆车上，如果当前汽车装完上一个班级后，
 * 下一个班级所有同学无法装下，那么当前车开走使用下一辆车。
 */
public class TakePeople {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(solve(max, a));
    }

    private static int solve(int max, int[] a) {
        int carnum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {//装不下一整个班
                carnum++;
                a[i] = a[i] - max;
                i--;
            } else { //a[i]<max,有空位
                int res = max - a[i];
                int j = i + 1;
                while (j < a.length && a[j] <= res) {
                    res = res - a[j];
                    j++;
                }
                carnum++;
                i = j - 1;
            }
        }
        return carnum;
    }
}
