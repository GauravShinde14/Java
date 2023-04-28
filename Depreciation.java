public class Depreciation {
    public static void main(String[] args) {
        depreciationCalculator(200, 10, 2);
    }

    public static void depreciationCalculator(double initialValue,double rateOfDepreciation,int time){
        double depreciation =(double) initialValue*Math.pow(1-rateOfDepreciation/100, time);
        System.out.println(depreciation);
    }
}
