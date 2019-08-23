package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 *
 * 你知道行编辑器吗？不知道也没关系，现在我会告诉你：
 * 1如果你收到一个#，那么你应该删掉一个你已经收到的字符，不包括#；
 * 2如果你收到@;，那么你应该把你收到的一整行都删掉。（#和@都为不可见字符。）
 * 输入： 第一行是一个整数T，代表有T组数据。每组数据的开始时一个字符串，具体可以看样例
 * 样例输入：
3
whli##ilr#e(s#*s)
outcha@putchar(*s=#++)
returnWA##A!!##C
 */
public class HangBianJiQi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String en = in.nextLine();
        for(int i=0;i<n;i++){
            String s = in.nextLine();
            System.out.println(process(s));
        }
    }

    private static String process(String str) {
        String s  = "";
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if (c == '@') {
                s="";
            }else if(c=='#'){
                if (s.length() != 0) {
                    s = s.substring(0, s.length() - 1);
                }
            }else{
                s=s+c;
            }
        }
        return s;
    }

}
