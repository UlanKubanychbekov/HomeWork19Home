package peaksoft;

import java.util.Arrays;

public class Hostels extends Building implements ToMakePaymentHols {

    public Hostels(String address, int money) {
        super(address, money);
    }


    @Override
    public void toMakePayment() {
        System.out.println("Платят за аренду: "+ getMoney());

    }
}
