package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 * 小A有一张半径为r的圆桌，其中心位于(x,y)，
 * 现在他想把圆桌的中心移到(x1, y1)。每次移动一步，小A都得在圆桌边界上固定一个点，
 * 然后将圆桌绕这个点旋转。 问最少需要几步才能把圆桌移到目标位置？
 * 一行五个整数r,x,y,x1,y1( 1 ≤ r ≤ 100000,  - 100000 ≤ x, y, x1, y1 ≤ 100000)。
 */
public class BanYuanZhuo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long r = in.nextInt();
        long x = in.nextInt();
        long y = in.nextInt();
        long x1 = in.nextInt();
        long y1 = in.nextInt();

        double distance = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
        long step = 0;
        if (distance % (2 * r) == 0) {
             step = (long) (distance / (2 * r));
        } else {
             step = (long) (distance / (2 * r)) + 1;
        }
        System.out.println(step);

    }
}
