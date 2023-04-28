


public class Factorial{
    public static void main(String[] args) {
        Fact(4);
    }

    public static void Fact(int n){
        int num = n;
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;


        }
        System.out.println(fact);
    }

    
}
