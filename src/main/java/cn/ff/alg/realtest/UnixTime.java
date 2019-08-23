package cn.ff.alg.realtest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 *
 * Unix 时间戳定义为从格林威治时间1970年01月01日00时00分00秒起至现在的总秒数
 * 输入不超过50行，每行包含一个整数 x 表示一个 Unix 时间戳。
 * 返回对应时间
 */
public class UnixTime {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long s = in.nextLong();
            SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd");
            Date d = df.parse("1970 01 01");
            long time = d.getTime() + s * 1000;
            Date now = new Date(time);
            String nowstr = df.format(now);
            System.out.println(nowstr);
        }
        in.close();
    }
}
