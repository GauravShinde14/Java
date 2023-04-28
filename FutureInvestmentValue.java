public class FutureInvestmentValue {
    public static void main(String[] args) {
        Fv(10000, 1, 10);
    }

    public static void Fv(double presentValue , double interest, double periods){
        double futureValue = presentValue*Math.pow(1+interest/100, periods);
        System.out.println(futureValue);
    }
}
