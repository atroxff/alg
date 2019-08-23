package cn.ff.alg.algbasetest.difficult;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/8
 *
 * 有"abcdefghijkl”12个字符，将其所有的排列中按字典序排列，给出任意一种排列，
 * 说出这个排列在所有的排列中是第几小的？
 *
 * 转换12进制加减法
 */
public class StringCompareBig {
    public static List<String> charlist = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String en = in.nextLine();
        //System.out.println("输入"+n+"组数据");
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            System.out.println(fun(s));
        }
    }

    //abcdefghijkl（1）比
    private static int fun(String s) {
        char[] ch = s.toCharArray();
        int res=0;//总差
        int t = 0;//本位查
        int c = 1;//权重
        for (int i = ch.length-1; i >= 0;i--) {
            t = charlist.indexOf(ch[i] + "") - i;
            res=res+t*c;
            c = c * 11;
        }
        return res;
    }
}
