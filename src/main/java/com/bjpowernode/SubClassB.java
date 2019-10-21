package com.bjpowernode;/**
 * ClassName:SubClassB
 * Package:com.bjpowernode
 * Description
 *
 * @date ：${Date}
 */

/**
 *Author：Rainyu
 *2019/10/21
 */

public class SubClassB extends Base {
    public String str = "SUbClassB";


    @Override
    public void printA() {
        System.out.println ("i am "+str);
    }
}
