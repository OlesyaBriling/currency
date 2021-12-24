package converter;

public class ConverterIml implements Converter {

    public double convert(Currency from, Currency to, double count) {
        double result = from.getValueCurrency() * count / to.getValueCurrency();
        return result;
    }
}
