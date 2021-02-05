
package com.test.demowzg.wzg_test.GaoBingFaChongTu;

public class Account {
    private int count=0;

    public synchronized void addAccount(String name, int money){
        count += money;
        System.out.println(name + "..存入:" + money+".." + Thread.currentThread().getName());
        selectAccount(name);
    }

    public synchronized  void  subAccount(String name, int money){
        if(count - money < 0){
            System.out.println("账户余额不足！");
            return;
        }
        count -= money;
        System.out.println(name + "。。取出：" + money +".." + Thread.currentThread().getName());
        selectAccount(name);
    }

    public void selectAccount(String name){
        System.out.println(name + "..余额" + count);
    }
}
