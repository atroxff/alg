package cn.ff.alg.realtest;

import java.util.*;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 *
 * 一些子串只由一种字母构成，他想知道在S中一共有多少种这样的子串。
 * 例如在串”aaabbaa”中，度度熊想找的子串有”a”,”aa”,”aaa”,”b”,”bb”五种。
 */
public class ChildString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(size(s));
        System.out.println(size1(s));
    }

    private static int size(String s) {
        List<String> list = new ArrayList<>();
        int begin= 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(begin) != s.charAt(i)) {
                begin = i;
            }
            String tmp = s.substring(begin,i+1);
            if (list.indexOf(tmp)==-1) {
                list.add(tmp);
            }
        }
        return list.size();
    }

    private static int size1(String s) {
        Set<String> subStringSet = new HashSet<>();
        int count = 0;

        int begin = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(begin)) {
                begin = i;
            }
            if (subStringSet.add(s.substring(begin, i + 1))) {
                count++;
            }
        }
        return count;
    }


}
