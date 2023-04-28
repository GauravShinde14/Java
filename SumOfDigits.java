public class SumOfDigits {
    public static void main(String[] args) {
        
        sumofDigits(55);
    }

    public static void sumofDigits(int num){
        int sum =0;
        int digit;

        for(int i=0;i<num;i++){
            digit = num%10;
            sum = sum+digit;
            num = num/10;
        }

        System.out.println(sum);
    }
    
}
