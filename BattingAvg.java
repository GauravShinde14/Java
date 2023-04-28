public class BattingAvg{
    public static void main(String[] args) {
        BattingAvgCalculator(200, 8);
    }

    public static void BattingAvgCalculator(int totalruns, int noOfOut ){
        int avg = totalruns/noOfOut;
        System.out.println(avg);
    }
}