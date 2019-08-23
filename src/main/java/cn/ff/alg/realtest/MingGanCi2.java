package cn.ff.alg.realtest;

import java.util.List;
import java.util.Scanner;

/**
 * 屏蔽关键词
 * 方法1
 */
public class MingGanCi2
{
    //创建键盘录入对象
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int n=sc.nextInt();
        String keyWord[]=new String[n];
        for(int i=0;i<n;i++)
        {
            keyWord[i]=sc.next().toLowerCase();
        }
        sc.nextLine();
        String str=sc.nextLine();
        String str1=str.toLowerCase();
        String baseCode="****************************";
        String code=null;

        int len=0;
        for(String word:keyWord)
        {
            int x=0;
            int val;
            while((val=str1.indexOf(word,x))!=-1)
            {
                len=word.length();
                code=baseCode.substring(0,len);
                str=str.replace(str.substring(val, val+len),code);
                x=val+len;
            }
        }
        System.out.println(str);

    }
}