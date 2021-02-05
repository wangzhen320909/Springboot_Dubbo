package com.test.demowzg.wzg_test.GaoBingFaChongTu;

public class Card implements Runnable {
    private String name;
    private Account account = new Account();

    public Card(String name, Account account){
        this.name = name;
        this.account = account;
    }
    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(100);
            }catch (Exception w){

            }
            account.addAccount(name, 100);
        }

    }
}