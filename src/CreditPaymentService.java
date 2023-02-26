public class CreditPaymentService {
    public int calculate(double ratePercent, int periodYear, int sumRubles) {
        double calcPercent = (ratePercent / 100 / 12);
        int result = (int) ((int) sumRubles * ((calcPercent * Math.pow((1 + calcPercent), 12 * periodYear)) / (Math.pow((1 + calcPercent), 12 * periodYear) - 1)));
        return result;
    }
}
