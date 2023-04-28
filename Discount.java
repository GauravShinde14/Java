public class Discount {
    public static void main(String[] args) {
        
        DiscountCalculator(1000, 20);
    }

    public static void DiscountCalculator(double price , double discount){
        double amount  =( price*(discount/100));
        double actualdis =  price-amount;
        System.out.println(actualdis);
    }
}
