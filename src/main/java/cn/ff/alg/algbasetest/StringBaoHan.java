package cn.ff.alg.algbasetest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/8
 */
public class StringBaoHan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 将两个字符串存入字符数组中
        char[] a = scanner.nextLine().toCharArray();
        char[] b = scanner.nextLine().toCharArray();
        List<Character> lista = new ArrayList<>();
        List<Character> listb = new ArrayList<>();
        for (char c : a) {
            lista.add(c);
        }
        for (char c : b) {
            listb.add(c);
        }
        int count =0;
        // 遍历数组确定字符数组a中是否存在b中的所有重复字符 ,注意所有
        for (int i=0;i<listb.size();i++) {
            for (int j=0;j<lista.size();j++) {
                if (listb.get(i) == lista.get(j)) {
                    count++;
                    lista.remove(j);
                    break;
                }
            }
        }
        if (count == b.length)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
