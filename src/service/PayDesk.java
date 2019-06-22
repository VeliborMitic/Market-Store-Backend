package service;

import model.Card;

public class PayDesk {

    private PayDesk() {
        throw new IllegalStateException("Utility class");
    }

    public static void calculateTotal (double purchaseValue, Card card){
        double discountRate = card.calculateDiscountRate();
        double discountValue = purchaseValue * discountRate/100;
        double purchaseTotal = purchaseValue - discountValue;

        String cashFormat = "%-15s %s%7.2f\n";
        String rateFormat = "%-15s %7.1f%%\n";
        System.out.printf(cashFormat, "Purchase value:", "$", purchaseValue);
        System.out.printf(rateFormat, "Discount rate:", discountRate);
        System.out.printf(cashFormat, "Discount:", "$", discountValue);
        System.out.printf(cashFormat, "Total:", "$", purchaseTotal);
        System.out.println();
    }
}