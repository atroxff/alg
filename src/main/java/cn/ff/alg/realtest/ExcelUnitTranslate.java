package cn.ff.alg.realtest;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 *
 * 单元格的坐标编号  RxCy转换
 */
public class ExcelUnitTranslate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            String s = in.next();
            str[i] = s;
        }
        for (String s : str) {
            System.out.println(fn(s));
        }
    }
    private static String fn(String s) {
//        if(s.indexOf('R')!=0||s.indexOf('C')==-1){//BC23类型
//            s=changeToRC(s);
//        }else{
//            String s1=s.substring(1,s.indexOf('C'));
//            try { //RxCy类型
//                Integer.parseInt(s1);
//                s=changeToAN(s);
//            } catch (Exception e) {
//                s=changeToRC(s);//BC23类型
//            }
//        }
        if (s.matches("R\\d+C\\d+")) {//正则
            return changeToAN(s);
        }
        return changeToRC(s);
    }

    private static String changeToRC(String s) {//BC23类型=>RxCy类型
        int i = 0;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') break;
        }
        String s1 = s.substring(0,i);//y
        String s2 = s.substring(i);//x
        int sumx = 0;
        int tmp = 1;
        for (int j = s1.length()-1; j >=0; j--) {
            int c=s.charAt(j)-'A'+1;
            sumx+=c*tmp;
            tmp = tmp * 26;
        }
        s = "R" + s2 + "C" + String.valueOf(sumx);
        return s;
    }
    private static String changeToAN(String s) {//RxCy类型=>BC23类型
        String strrow = s.substring(1, s.indexOf('C'));//row
        String strcol = s.substring(s.indexOf('C') + 1);//col
        int col = Integer.parseInt(strcol);
        String res = "";
        while (col > 0) {
            char c = (char) ('A' + (col-1) % 26);
            res = c + res;
            col=(col-1)/26;
        }
        s = res + strrow;
        return s;
    }
}