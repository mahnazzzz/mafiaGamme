package strategyi.model;

import strategyi.controller.InterfacePriceAvailer;
import java.util.Calendar;
import java.util.TimeZone;
import jdk.nashorn.internal.ir.Symbol;

public class PRICE_SECONDS_OF_THE_CLOCK implements InterfacePriceAvailer {

    Calendar cal = Calendar.getInstance(TimeZone.getDefault());
    private int price;
    private int amount;

    @Override
    public int getprice() {
        return price;
    }

    @Override
    public int getavail() {
        return amount;
    }

    @Override
    public int getNewPrice(int price) {
        cal = Calendar.getInstance(TimeZone.getDefault());
        price = cal.get(Calendar.SECOND) * 2;
        return price;
    }

    @Override
    public int getNewAvailability(int availability) {
        cal = Calendar.getInstance(TimeZone.getDefault());
        amount = cal.get(Calendar.SECOND);
        return amount;
    }

}
