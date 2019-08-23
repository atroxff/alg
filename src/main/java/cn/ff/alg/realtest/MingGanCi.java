package cn.ff.alg.realtest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 *
 * 出现敏感单词，即使作为子串出现也要被和谐
 * 例如当敏感词是gre，eat 是
 * Your English is Great.
 * 将被和谐成
 * Your English is *****.
 *
4
revolution
greatwall
democracy
science
Cross the greatwall, we can reach every corner of the world.
7
wall
stone
s
k
brick
gre
eat
The Great Wall of China is a series of fortifications made of stone, brick, tamped earth, wood, and other materials, generally built along an east-to-west line across the historical northern borders of China to protect the Chinese states and empires against the raids and invasions of the various nomadic groups of the Eurasian Steppe. Several walls were being built as early as the 7th century BC;[2] these, later joined together and made bigger and stronger, are now collectively referred to as the Great Wall.[3] Especially famous is the wall built 220���C206 BC by Qin Shi Huang, the first Emperor of China. Little of that wall remains. Since then, the Great Wall has on and off been rebuilt, maintained, and enhanced; the majority of the existing wall is from the Ming Dynasty. Other purposes of the Great Wall have included border controls, allowing the imposition of duties on goods transported along the Silk Road, regulation or encouragement of trade and the control of immigration and emigration. Furthermore, the defensive characteristics of the Great Wall were enhanced by the construction of watch towers, troop barracks, garrison stations, signaling capabilities through the means of smoke or fire, and the fact that the path of the Great Wall also served as a transportation corridor.


 */
public class MingGanCi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] key = new String[n];

        for (int i = 0; i < n; i++) {
            key[i] = in.nextLine().toLowerCase();
        }
        String s = in.nextLine();
        String[] strs2=s.split(" ");
        for (int i = 0; i < strs2.length; i++) {
            for (String e : key) {
                if (strs2[i].toLowerCase().contains(e)) {
                    int len = strs2[i].length();
                    String end = "";
                    if (strs2[i].charAt(len - 1) == ',' || strs2[i].charAt(len - 1) == '.') {
                        len--;
                        end = strs2[i].substring(len);
                    }
                    strs2[i] = "";
                    while (len-- > 0) {
                        strs2[i] = strs2[i] + "*";
                    }
                    strs2[i] = strs2[i] + end;
                    break;
                }
            }
        }

        for (String e2 : strs2) {
            System.out.print(e2 + " ");
        }
    }
}
