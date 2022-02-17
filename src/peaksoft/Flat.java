package peaksoft;

import java.util.Arrays;

public class Flat extends Building implements ToMakePaymentFlat {

    public Flat(String address, int money) {
        super(address, money);
    }

    @Override
    public void toMakePayment() {
        System.out.println("Платит за ком.услуги: "+getMoney());

    }
}
