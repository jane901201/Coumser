package com.tom;

public class ManuHandler {



    public static void main(String[] args) {
        Coumser[] coumsers = {
                new Coumser("0013", 490),
                new Coumser("0052", 1000),
                new Coumser("0081", 290),
                new Coumser("2122", 2000),

        };


        System.out.println("Coumser Number/Cost/Discount/total");
        for(int i = 0; i < coumsers.length; i++) {
            coumsers[i].print();
        }

    }
}
