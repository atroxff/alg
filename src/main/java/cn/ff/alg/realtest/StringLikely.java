package cn.ff.alg.realtest;

import java.util.*;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 *
 * 1、S和T长度相同。
 * 2、对于任意两个位置i和j，如果Si和Sj相同，那么Ti和Tj相同；如果Si和Sj不同，那么Ti和Tj不同。（Si的含义为字符串S在第i个位置的字符，Ti的含义为字符串T在第i个位置的字符）
 * 输出与之相似的字典序最小的串
 */
public class StringLikely {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        Map<Character, Character> map = new HashMap<>(); //原始字符 转换后字符
        char a = 'a';
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                chars[i] = map.get(chars[i]);
            }else{
                map.put(chars[i], a);
                chars[i] = a;
                a++;
            }
        }
        for (char k : chars) {
            System.out.print(k);
        }
    }
}
