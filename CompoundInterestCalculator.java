public class CompoundInterestCalculator {
    public static void main(String[] args) {
        calc(1200, 5.4, 2);
    }

    public static void calc(double principalAmount ,double rate , double time ){
        double compoundInterest = principalAmount*Math.pow(1+rate/100, time);
        System.out.println(compoundInterest);
    }
}
