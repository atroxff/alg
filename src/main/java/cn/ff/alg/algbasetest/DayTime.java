package cn.ff.alg.algbasetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/8
 */
public class DayTime {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date day = df.parse(s);
        Date now = df.parse("2015-10-18");
        long time = (day.getTime()-now.getTime())/24/60/60/1000;
        System.out.println(time);

    }
}
