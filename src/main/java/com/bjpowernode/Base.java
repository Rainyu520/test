package com.bjpowernode;/**
 * ClassName:Base
 * Package:com.bjpowernode
 * Description
 *
 * @date ：${Date}
 */

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *Author：Rainyu
 *2019/10/21
 */

public class Base {
   ThreadLocal<String> threadLocal=new ThreadLocal<String> ();

    public void set(){
        threadLocal.set ("x");
    }

    public void get(){
        threadLocal.get ();
    }
}
