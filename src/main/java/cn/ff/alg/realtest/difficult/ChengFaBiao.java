package cn.ff.alg.realtest.difficult;

import java.util.*;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 *
 * 对于n*m的乘法表，只要给出一个数k，
 * 乘法表中元素按照不减顺序排列之后，第k个元素是多少
 */
public class ChengFaBiao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long i = in.nextInt();
        long j = in.nextInt();
        long k = in.nextInt();
        long left = 0;
        long right = i * j;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (sum(mid, i, j) < k) {//前一半排序后数量<k
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);

    }

    private static long sum(long base, long m, long n) {
        long res = 0;
        for (int i = 1; i <= m; i++) {
            //res += (base > (n * i) ? n : (base / i));
            if (base > (n * i)) {
                res += n;
            }
            else{
                res += base / i;
            }
        }
        return res;
    }
}
