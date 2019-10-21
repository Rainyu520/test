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

public class Sinlenton2 {
    private static volatile Sinlenton2 sinlenton = null;
    private static int n = 0;
    public Sinlenton2() {

    }

    public static Sinlenton2 getSinlenton() {
        synchronized (Sinlenton.class) {
            if (sinlenton == null) {
                sinlenton = new Sinlenton2 ();
                System.out.println (n++);
            }
        }
        return sinlenton;
    }


}
