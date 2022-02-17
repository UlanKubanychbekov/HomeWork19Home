package peaksoft;

import java.util.Arrays;

public class Hotel extends Building implements ToMakePaymentHols {
    public Hotel(String address, int money) {
        super(address, money);
    }


    @Override
    public void toMakePayment() {
        System.out.println("Платят за аренду: "+ getMoney());

    }
}
