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

public class Sinlenton3 {
    private static volatile Sinlenton3 sinlenton = null;
    private static  int n = 0;

    public Sinlenton3() {

    }

    public static Sinlenton3 getSinlenton() {
        if (sinlenton == null) {
            synchronized (Sinlenton.class) {
                if (sinlenton == null) {
                    sinlenton = new Sinlenton3 ();
                    System.out.println (n++);
                }
            }
        }
        return sinlenton;
    }


}
