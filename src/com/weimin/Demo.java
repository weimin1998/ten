package com.weimin;

/**
 * 走步数  跳台阶
 */
public class Demo {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(test2(40));
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }

    // 递归
    public static int test(int n){
        if(n==1||n==2){
            return n;
        }


        return test(n-2)+test(n-1);
    }


    // 迭代
    public static int test2(int n){
        if(n==1||n==2){
            return n;
        }

        int one = 1;
        int two = 2;
        int sum = 0;
        for (int i = 3; i <=n ; i++) {
            sum = one+two;
            one = two;
            two = sum;
        }

        return sum;
    }
}
