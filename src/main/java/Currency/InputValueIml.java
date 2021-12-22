package Currency;

import java.util.Scanner;

public class InputValueIml implements InputValue {
    Scanner input = new Scanner(System.in);

    public int inputFrom(int from){
        System.out.println("Выберите валюту для перевода: 1. USD 2. RUB 3. EUR");
        from = input.nextInt();
        return from;
    }

    public int inputTo(int to){
        System.out.println("Выберите получаемую валюту: 1. USD 2. RUB 3. EUR");
        to = input.nextInt();
        return to;
    }

    public int inputCount(int count){
        System.out.println("Сумма переводимой валюты");
        count = input.nextInt();
        return count;
    }

}
