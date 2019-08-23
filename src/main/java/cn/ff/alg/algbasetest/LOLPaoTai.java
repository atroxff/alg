package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/12
 *
 * 第一行9个整数，R，x1,y1,x2,y2,x3,y3,x0,y0。(0 <= R，x1,y1,x2,y2,x3,y3,x0,y0 <= 100)
 * R 代表炮台攻击的最大距离，
 * (x1,y1), (x2,y2), (x3,y3)代表三个炮台的坐标。
 * (x0,y0)代表敌人的坐标。
 */
public class LOLPaoTai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int p[][] = new int[4][2];
        int c = 0;
        for (int i = 1; i <=3; i++) {
            p[i][0] = in.nextInt();//x
            p[i][1] = in.nextInt();//y
        }
        p[0][0] = in.nextInt();
        p[0][1] = in.nextInt();

        for (int i = 1; i <=3; i++) {
            if(R*R>=(p[i][0]-p[0][0])*(p[i][0]-p[0][0])+(p[i][1]-p[0][1])*(p[i][1]-p[0][1])){
                c++;
            }
        }
        System.out.println(c+"X");

    }
}
