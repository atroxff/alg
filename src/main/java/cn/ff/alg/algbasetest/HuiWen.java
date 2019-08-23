package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 * 给定一个字符串，问是否能够通过添加一个字母将其变成“回文串”。
 * “回文串”是指正着和反着读都一样的字符串。
 * 如：”aa”,”bob”,”testset”是回文串，”alice”,”time”都不是回文串。
 */
public class HuiWen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(isHStr(s));
    }

    private static String isHStr(String s) {
        int i = 0;
        int j = s.length() - 1;
        int k = 0;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                continue;
            } else if (k == 0 && s.charAt(i + 1) == s.charAt(j)) {
                i+=2;
                j--;
                k++;
                continue;
            } else if (k == 0 && s.charAt(i) == s.charAt(j - 1)) {
                i++;
                j-=2;
                k++;
                continue;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
