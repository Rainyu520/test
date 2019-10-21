package com.bjpowernode.sinlenton;/**
 * ClassName:Sinlenton
 * Package:com.bjpowernode
 * Description
 *
 * @date ：${Date}
 */

/**
 * Author：Rainyu
 * 2019/10/17
 */

public class Sinlenton1 {
    private static Sinlenton1 sinlenton = null;
    private static int n = 0;
    public Sinlenton1() {

    }

    public static Sinlenton1 getSinlenton() {
        if (sinlenton == null) {
            sinlenton = new Sinlenton1 ();
            System.out.println (n++);
        }
        return sinlenton;
    }




}
