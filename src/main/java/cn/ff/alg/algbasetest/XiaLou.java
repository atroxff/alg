package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 * 电梯先到达这一层->开门->关门->电梯再到达第一层->开门
 * 第一行两个整数n，m，其中n表示小赛家在的楼层，m表示当前电梯停在的楼层，
 * 第二行四个整数，t1，t2，t3，t4，
 * 其中t1表示电梯每经过一层楼的时间，t2表示开门时间，t3表示关门时间，t4表示小赛每下一层楼的时间。
 */
public class XiaLou {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();//人
        int m=in.nextInt();//电梯
        long t1 = in.nextInt();
        long t2 = in.nextInt();
        long t3 = in.nextInt();
        long t4 = in.nextInt();
        long res1 = t4 * (n - 1);
        long res2 = (Math.abs(m - n) + n - 1) * t1 + 2 * t2 + t3;
        long min = Math.min(res1, res2);
        System.out.println(min);

    }
}
