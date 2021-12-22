import Currency.ConvertCurrency;
import Currency.InputValueIml;

import static Currency.InputValue.to;

public class Main {
    public static void main(String[] args) {
        ConvertCurrency currency = new ConvertCurrency();
        InputValueIml inputValueIml = new InputValueIml();
        currency.converter(inputValueIml.inputTo(to));
    }
}
