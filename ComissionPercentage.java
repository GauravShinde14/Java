public class ComissionPercentage {
    public static void main(String[] args) {
        Comissionper(15, 10000);
    }

    public static void Comissionper (double commissionpercent, double amount){
        double commissionAmount = amount*(commissionpercent/100);
        System.out.println(commissionAmount);

    }
}
