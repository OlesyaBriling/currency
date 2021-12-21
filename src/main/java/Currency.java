public class Currency {

    private final double EUR = 0.88;
    private final double USD = 1;
    private final double RUB = 60;

    public double toEUR( int from, double count) {
        double result;
        switch (from) {
            case (1):
                result = EUR * USD * count;
                break;
            case (2):
                result = EUR / RUB * count;
                break;
            default:
                return count;
        }
        return result;
    }

    public double toUSD( int from, double count) {
        double result;
        switch (from) {
            case (3):
                result = EUR * USD * count;
                break;
            case (2):
                result = USD / RUB * count;
                break;
            default:
                return count;
        }
        return result;
    }

    public double toRUB( int from, double count) {
        double result;
        switch (from) {
            case (1):
                result = RUB * USD * count;
                break;
            case (3):
                result = EUR * RUB * count;
                break;
            default:
                return count;
        }
        return result;
    }

}
