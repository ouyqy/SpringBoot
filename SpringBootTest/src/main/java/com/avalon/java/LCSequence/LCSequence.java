package com.avalon.java.LCSequence;

/**
 * @Author ouyqy
 * 2018/4/17 16:41
 */
public class LCSequence {

    public static int LCS(String str1, String str2) {

        int[][] c = new int[str1.length() + 1][str2.length() + 1];
        for (int row = 0; row <= str1.length(); row++)
            c[row][0] = 0;
        for (int column = 0; column <= str2.length(); column++)
            c[0][column] = 0;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else if (c[i][j - 1] > c[i - 1][j]) {
                    c[i][j] = c[i][j - 1];
                } else {
                    c[i][j] = c[i - 1][j];
                }
            }
        }

        System.out.println("------------------");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        return c[str1.length()][str2.length()];
    }

    public static String LCString(String str1, String str2) {

        String[][] c = new String[str1.length() + 1][str2.length() + 1];
        for (int row = 0; row <= str1.length(); row++)
            c[row][0] = "";
        for (int column = 0; column <= str2.length(); column++)
            c[0][column] = "";

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + c[i][j];
                } else if (c[i][j - 1].length() > c[i - 1][j].length()) {
                    c[i][j] = c[i][j - 1];
                } else {
                    c[i][j] = c[i - 1][j];
                }
            }
        }

        System.out.println("------------------");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        return c[str1.length()][str2.length()];
    }


    public static void main(String[] args) {
        String str1 = "BCDCABA";
        String str2 = "ABCBDABA";
        int result = LCS(str1, str2);
        System.out.println(result);

        System.out.println("-----------------------");

//        String str = LCString(str1,str2);
//        System.out.println(str);

        System.out.println("1234567890abcdef".substring(8));
    }
}
