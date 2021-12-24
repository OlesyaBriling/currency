package converter;

public class Currency {
    String nameCurrency;
    double valueCurrency;

    public Currency(String nameCurrency, double valueCurrency) {
        this.nameCurrency = nameCurrency;
        this.valueCurrency = valueCurrency;
    }

    public String getNameCurrency() {
        return nameCurrency;
    }

    public void setNameCurrency(String nameCurrency) {
        this.nameCurrency = nameCurrency;
    }

    public double getValueCurrency() {
        return valueCurrency;
    }

    public void setValueCurrency(double valueCurrency) {
        this.valueCurrency = valueCurrency;
    }
}
