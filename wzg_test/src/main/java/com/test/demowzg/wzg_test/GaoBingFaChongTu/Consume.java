package com.test.demowzg.wzg_test.GaoBingFaChongTu;

public class Consume implements Runnable {
    private String name;
    private Account account = new Account();

    public Consume(String name, Account account){
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
            account.subAccount(name, 100);
        }
    }
}
