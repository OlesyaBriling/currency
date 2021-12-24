import Currency.ConvertCurrency;
import Currency.InputValueIml;
import converter.ConverterIml;
import converter.Currency;

import static Currency.InputValue.to;

public class Main {
    public static void main(String[] args) {

//        ConvertCurrency currency = new ConvertCurrency();
//        InputValueIml inputValueIml = new InputValueIml();
//        currency.converter(inputValueIml.inputTo(to));

        Currency from = new Currency("EUR", 0.88);
        Currency to = new Currency("RUB", 60);
        ConverterIml converter = new ConverterIml();
        System.out.println(converter.convert(from, to, 1000));
        System.out.println(converter.convert(to, from, 1000));
    }
}
