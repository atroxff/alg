package cn.ff.alg.algbasetest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/7
 */
public class XiangLiang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            Map<String, Integer> map = new HashMap<>();
            String s = in.nextLine();
            String[] s1 = s.split(" ");
            for (int i = 0; i < s1.length; i++) {
                if(map.containsKey(s1[i])){
                    map.replace(s1[i], map.get(s1[i])+1);
                }else{
                    map.put(s1[i], 1);
                }
            }
            Integer[] a =  map.values().toArray(new Integer[0]);
            Arrays.sort(a);
            for (int v : a) {
                System.out.print(v+" ");
            }
        }
        in.close();
    }
}
