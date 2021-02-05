package com.test.demowzg.wzg_test.GaoBingFaChongTu;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        Card card = new Card("card",account);
        Paper paper = new Paper("存折",account);
        Consume consume = new Consume("存折",account);
        Thread card1 = new Thread(card);
        Thread paper1 = new Thread(paper);
        Thread consume1 = new Thread(consume);
        card1.start();
        consume1.start();
        paper1.start();
    }
}
