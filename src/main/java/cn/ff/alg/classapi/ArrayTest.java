package cn.ff.alg.classapi;

import java.util.Arrays;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] a  = {7,6,8,5,4,3,2,1};
//	    Scanner sc = new Scanner(System.in);
//	    for (int i = 0; i < a.length; i++) {
//	        //System.out.print("please input no."+(i+1));
//	        a[i] = sc.nextInt();
//	    }

        //遍历数组
//        for (int i : a) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
        System.out.println(Arrays.toString(a));
        //排序数组，从小到大
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println();
    }
}
