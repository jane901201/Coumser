package com.tom;

public class Coumser {
    private String number;
    private int coin;
    private int discount;

    public Coumser(String number, int coin) {
        this.number = number;
        this.coin = coin;
        setDiscount();
    }

    private void setDiscount() {
        this.discount = coin/1000*100;
    }

    public void print() {
        System.out.println(number + " " + coin + " "+ discount + " " + (coin - discount));
    }
}
