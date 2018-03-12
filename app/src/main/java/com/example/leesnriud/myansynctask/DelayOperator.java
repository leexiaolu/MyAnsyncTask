package com.example.leesnriud.myansynctask;

/**
 * Created by lee.snriud on 2018/3/12.
 */

public class DelayOperator {

    //延时操作,用来模拟下载
    public void delay()
    {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();;
        }
    }
}
