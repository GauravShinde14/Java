public class ElecctricityBillCalculator {
    public static void main(String[] args) {
        ElectricityBill(200, 10);
    }

    public static void ElectricityBill (int watts,int costPerUnit){
     

       int totalCost = watts*costPerUnit;
       System.out.println(totalCost);

        

    }
}
