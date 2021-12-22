package Currency;

public interface InputValue {
     int from = 0;
     int to = 0;
     int count = 0;

     int inputFrom(int from);
     int inputTo(int to);
     int inputCount(int count);
}
