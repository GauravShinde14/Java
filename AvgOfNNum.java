import java.util.Scanner;

public class AvgOfNNum{
    
    public static void main(String[] args) {
       Avg(5);
    }

    public static void Avg(int n){
        Scanner sc = new Scanner(System.in);
        int avg =0;
        int [] numbers = new int [n];
        for(int i=0;i<n ;i++){
            numbers[i] = sc.nextInt();
        }

        for(int i =0;i<numbers.length;i++ ){
            avg =avg+ numbers[i];
        }
        System.out.println(avg);
    }
}