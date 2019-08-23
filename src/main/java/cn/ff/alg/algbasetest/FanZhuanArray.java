package cn.ff.alg.algbasetest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/8
 *
 * 数组是否存在这样一个片段，只将该片段翻转就可以使整个数组升序排列
 * 思路：
 * 备份数组升序排序，与原数组对比，从两头开始向中间截取不同片段
 * 判断该片段是否降序
 */
/*改进*/
public class FanZhuanArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int i = 0;
        int len = n;
        int left = 0;
        int right = n - 1;
        while (n-- > 0) {
            a[i++] = in.nextInt();
        }
        int[] copy=a.clone();
        Arrays.sort(copy);
        //截取不满足升序的片段
        while (left < len && copy[left] == a[left])left++;
        while (right >= 0 && copy[right] == a[right]) right--;
        //判断该片段是否降序
        for (i = 0; i <= right - left; i++) {
            if (copy[left + i] != a[right - i]) {
                break;
            }
        }
        if (i > right - left) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
/*蛮力法*/
//public class FanZhuanArray {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n];
//        int[] b = new int[n];;
//        int i = 0;
//        int len = n;
//        boolean f = false;
//        while (n-- > 0) {
//            a[i++]=in.nextInt();
//        }
//        for (int j = 0; j < len; j++) {
//            for (int k = j; k < len; k++) {
//                int p=j;
//                int q=k;
//                b=a.clone();
//                //片段反序
//                while (p <= q) {
//                    int t = b[p];
//                    b[p] = b[q];
//                    b[q] = t;
//                    p++;
//                    q--;
//                }
//                int l = 0;
//                for (l = 0; l < len-1; l++) {
//                    if (b[l] > b[l+1]) {
//                        break;
//                    }
//                }
//                if (l >= len - 1) {
//                    f = true;
//                    break;
//                }
//            }
//            if(f){
//                break;
//            }
//
//        }
//        if (f) {
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
//    }
//}
