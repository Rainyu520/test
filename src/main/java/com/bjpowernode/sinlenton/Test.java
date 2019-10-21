package com.bjpowernode.sinlenton;/**
 * ClassName:Test
 * Package:com.bjpowernode
 * Description
 *
 * @date ：${Date}
 */


/**
 * Author：Rainyu
 * 2019/10/15
 */

public class Test {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            //System.out.println (Sinlenton.getSinlenton ().get ());
            Thread thread = new Thread (new myRunnbable ());
            thread.start ();


        }
    }

    public static class myRunnbable implements Runnable {

        public void run() {
            Sinlenton2 sinlenton = Sinlenton2.getSinlenton ();

        }

    }


}
