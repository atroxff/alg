package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/12
 *
蛇形填数
在n*n方阵里填入1,2,...,n*n,要求填成蛇形
10  11  12  1
9   16  13  2
8   15  14  3
7   6   5   4
 */
public class SnakeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int col = 0;
        int row = n-1;
        int m = 1;
        arr[col][row] = m;
        while (m < n * n) {
            while ((col + 1) < n && arr[col + 1][row] == 0) {
                col++;
                m++;
                arr[col][row] = m;
            }
            while ((row - 1) >= 0 && arr[col][row - 1] == 0) {
                row--;
                m++;
                arr[col][row] = m;
            }
            while ((col - 1) >= 0 && arr[col - 1][row] == 0) {
                col--;
                m++;
                arr[col][row] = m;
            }
            while ((row + 1) >= 0 && arr[col][row + 1] == 0) {
                row++;
                m++;
                arr[col][row] = m;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
