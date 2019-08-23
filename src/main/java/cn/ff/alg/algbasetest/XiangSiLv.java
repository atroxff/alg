package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 * 将字符串转化为一个01串。转化规则是如果这个字符如果是字母或者数字，这个字符变为1,其它变为0。然后将这个01串和黑默丁格观测星空得到的01串做比较，得到一个相似率。
 */
public class XiangSiLv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s = sc.nextLine();
        System.out.println(compare(s, s1));
    }

    private static String compare(String s, String s1) {
        if (s.length() != s1.length()) return "false length";

        StringBuffer sb = new StringBuffer();
        int same=0;
        for(int i = 0;i<s1.length();i++){
            if ((s1.charAt(i) >= '0' && s1.charAt(i) <= '9')||
                    (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')||
                    (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')) {
                sb.append('1');
            }else{
                sb.append('0');
            }

            if(sb.charAt(i)==s.charAt(i)){
                same++;
            }
        }
        float out = (float) same * 100 / (float) s.length();
        return String.format("%.2f",out)+ "%";

    }
}
