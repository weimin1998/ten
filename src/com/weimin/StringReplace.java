package com.weimin;

import java.util.Arrays;

/**
 * 替换空格
 */
public class StringReplace {
    public static void main(String[] args) {
        String string = "we are one";

        System.out.println("原字符串的长度：" + string.length());
        char[] chars = string.toCharArray();
        System.out.println(Arrays.toString(chars));

        int num = 0;
        for (char aChar : chars) {
            if (aChar == ' ') {
                num++;
            }
        }

        System.out.println("字符串中空格的数量：" + num);

        char[] result = new char[num * 2 + chars.length];

        int a = chars.length - 1;
        int b = result.length - 1;


        for (int i = a; i >= 0; i--) {
            if (chars[i] != ' ') {
                result[b] = chars[i];
                b--;
            } else {
                result[b] = '0';
                result[b - 1] = '2';
                result[b - 2] = '%';
                b -= 3;
            }
        }

        String s = new String(result);
        System.out.println(s);
        System.out.println("新字符串的长度：" + s.length());


    }
}
