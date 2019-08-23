package cn.ff.alg.classapi;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/7
 */
public class WeiYunSuan {
    public static void main(String[] args) {
        //1.移位运算  左移*2  右移/2
        int i= 5<<2;
        System.out.println(i);
        i= i>>1;
        System.out.println(i);

        //判断奇偶
        if ((i & 1) == 0) {
            System.out.println("偶数");
        }

    }
}
