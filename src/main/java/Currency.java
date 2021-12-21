
public interface Currency {
    double EUR = 0.88;
    double USD = 1;
    double RUB = 60;

     double toEUR( int from, double count);
     double toUSD( int from, double count);
     double toRUB( int from, double count);
}
