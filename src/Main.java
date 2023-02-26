public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double ratePercent = 9.99;
        int periodYear = 1;
        int sumRubles = 1000_000;
        int annuit = service.calculate(ratePercent, periodYear, sumRubles);
        System.out.println(annuit + (" руб."));

        System.out.println();
        System.out.println(service.calculate(ratePercent, periodYear = 2, sumRubles) + (" руб."));

        System.out.println();
        System.out.println(service.calculate(ratePercent, periodYear = 3, sumRubles) + (" руб."));
    }
}