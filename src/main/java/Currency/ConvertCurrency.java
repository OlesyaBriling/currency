package Currency;

import static Currency.InputValue.count;
import static Currency.InputValue.from;

public class ConvertCurrency {

    ExchangeIml exchange = new ExchangeIml();
    InputValueIml input = new InputValueIml();

    public void converter(int to){
        switch (to) {
            case (1):
                System.out.println(" in USD = " + exchange.toUSD(input.inputFrom(from), input.inputCount(count)));
                break;
            case (2):
                System.out.println(" in RUB = " + exchange.toRUB(input.inputFrom(from), input.inputCount(count)));
                break;
            case (3):
                System.out.println(" in EUR = " + exchange.toEUR(input.inputFrom(from), input.inputCount(count)));
                break;
            default:
                System.out.println("Неверный формат, попробуйте еще раз");
        }
    }

}
