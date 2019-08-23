package cn.ff.alg.algbasetest;

import java.util.*;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/8
 */
public class ZhiYinShu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = n;
        List<Integer> list = fun(n);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list.toString());

    }

    private static List<Integer> fun(int n) {
        List<Integer> res = new ArrayList<>();
        int p=1;
        int q=n;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                res.add(i);
                p = i;
                break;
            }
        }
        q = n / p;
        if (p == 1) {
            res.add(n);
            return res;
        }
        List<Integer> res1 = fun(p);
        List<Integer> res2 = fun(q);
        res1.addAll(res2);
        return res1;
    }

}
