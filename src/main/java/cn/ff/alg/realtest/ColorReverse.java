package cn.ff.alg.realtest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 *
 * 颜色取反，方法是把 RGB 的每个位转换成十进制 rgb，再用 255 减去，再转换成 16 进制。
 * 例如蓝色（#0000FF）取反是黄色（#FFFF00）。
 */
public class ColorReverse {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F");
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String red = s.substring(1, 3);
            String green = s.substring(3, 5);
            String blue = s.substring(5, 7);
            int r = 255-Integer.parseInt(red, 16);
            int g = 255-Integer.parseInt(green, 16);
            int b = 255-Integer.parseInt(blue, 16);
            red = Integer.toHexString(r);
            green = Integer.toHexString(g);
            blue = Integer.toHexString(b);

            if (red.length() == 1) {
                red = "0" + red;
            }
            if (green.length() == 1) {
                green = "0" + green;
            }
            if (blue.length() == 1) {
                blue = "0" + blue;
            }
            String res = "#" + red + green + blue;
            res = res.toUpperCase();
            System.out.println(res);

        }
        in.close();

    }
}
