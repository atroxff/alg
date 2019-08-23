package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/12
 *
 * 现在要从a2,a3...an-1中删除一个元素，问剩余序列的“最大间隔”最小是多少？
 */
public class ZuiDaJianGe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int max[] = new int[n];
        for (int i = 0; i < n; i++) {//删除i元素
            int a[]=arr.clone();
            if (i == 0) {
                a[i] = a[i + 1];
            }else {
                a[i] = a[i - 1];
            }
            int num = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j + 1] - a[j] > num) {
                    num=a[j + 1] - a[j];
                }
            }
            max[i] = num;
        }

        int min = max[0];
        for (int i = 0; i < n; i++) {
            if (max[i] < min) {
                min = max[i];
            }
        }
        System.out.println(min);
    }
}
