package com.bjpowernode.sinlenton;/**
 * ClassName:Sinlenton
 * Package:com.bjpowernode
 * Description
 *
 * @date ：${Date}
 */

/**
 *Author：Rainyu
 *2019/10/17
 */

public class Sinlenton {
    private static Sinlenton  sinlenton= new Sinlenton();
    private  static  int n=0;
    public Sinlenton(){

    }
    public static Sinlenton getSinlenton(){
        System.out.println (n++);
        return sinlenton;
    }

}
