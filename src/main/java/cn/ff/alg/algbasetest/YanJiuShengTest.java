package cn.ff.alg.algbasetest;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 * 我们知道，就计算机相关专业来说，考研有4门科目，分别是政治（满分100分），英语（满分100分），数学（满分150分）和专业课（满分150分）。
 * 某校计算机专业今年录取研究生的要求是：
 * 政治、英语每门课成绩不低于60分，数学和专业课不低于90分，总成绩不低于310分。
 * 350分以上（含350分）为公费（Gongfei），310分~349分为自费(Zifei)。
 */
public class YanJiuShengTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] score=new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                score[i][j]=in.nextInt();
            }
        }
        List<String> flag = isSuccee(score);
        for(String s:flag){
            System.out.println(s);
        }
    }

    private static List isSuccee(int[][] score) {
        List<String> flag = new ArrayList();
        for (int i = 0; i < score.length; i++) {
            int sum =score[i][0] + score[i][1] + score[i][2] + score[i][3];
            if (score[i][0] < 60 || score[i][1] < 60 || score[i][2] < 90 || score[i][3] < 90 ) {
                flag.add("Fail");
            } else if(sum<310){
                flag.add("Fail");
            } else if (sum < 350) {
                flag.add("Zifei");
            }else{
                flag.add("Gongfei");
            }
        }
        return flag;
    }
}
