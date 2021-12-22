package Currency;

import static Currency.Currency.*;

public class ExchangeIml implements Exchange {

    CurrencyIml currency = new CurrencyIml();

    public double toEUR(int from, double count) {
        double result;
        switch (from) {
            case (1):
                result = currency.getEUR(EUR) * currency.getUSD(USD) * count;
                break;
            case (2):
                result = currency.getEUR(EUR) / currency.getRUB(RUB) * count;
                break;
            default:
                return count;
        }
        return result;
    }

    public double toUSD(int from, double count) {
        double result;
        switch (from) {
            case (3):
                result = currency.getEUR(EUR)  * currency.getUSD(USD)  * count;
                break;
            case (2):
                result = currency.getUSD(USD)  / currency.getRUB(RUB) * count;
                break;
            default:
                return count;
        }
        return result;
    }

    public double toRUB(int from, double count) {
        double result;
        switch (from) {
            case (1):
                result = currency.getRUB(RUB)  * currency.getUSD(USD)  * count;
                break;
            case (3):
                result = currency.getEUR(EUR)  * RUB * count;
                break;
            default:
                return count;
        }
        return result;
    }
}
