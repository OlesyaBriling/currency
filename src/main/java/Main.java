import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CurrencyIml convert = new CurrencyIml();

        System.out.println("Выберите валюту для перевода: 1. USD 2. RUB 3. EUR");
        int from = input.nextInt();
        System.out.println("Выберите получаемую валюту: 1. USD 2. RUB 3. EUR");
        int to = input.nextInt();
        System.out.println("Сумма переводимой валюты");
        int count = input.nextInt();

        switch (to) {
            case (1):
                System.out.println(" in USD = " + convert.toUSD(from, count));
                break;
            case (2):
                System.out.println(" in RUB = " + convert.toRUB(from, count));
                break;
            case (3):
                System.out.println(" in EUR = " + convert.toEUR(from, count));
                break;
            default:
                System.out.println("Неверный формат, попробуйте еще раз");
        }


    }
}
