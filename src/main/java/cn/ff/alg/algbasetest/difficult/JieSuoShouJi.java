package cn.ff.alg.algbasetest.difficult;

import java.util.Scanner;

/**??????
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/7
 *
 * 小明只记得这个数字的十进制范围是l~r，且这个数的二进制表示中恰有m个1
 * 他最坏情况下，要试多少次密码才能确保打开手机呢？
 * 输入 l r m  在l-r的二进制数中，多少个满足有m个1
 *
 */
public class JieSuoShouJi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int m = in.nextInt();
        System.out.println(solve(l, r, m));
    }

    private static int solve(int l, int r, int m) {
        int c = 0;
        for (int i = l; i < r; i++) {
            if(Integer.bitCount(i)==m)
                c++;
        }
        return c;
    }

    private static boolean hasm1(int n, int m) {
//        while (n != 0) {
//
//        }
        return true;
    }
}
