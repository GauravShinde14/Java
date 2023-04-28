public class PermutationCombination {
    public static void main(String[] args) {
        permutation(12, 6);
        combination(10, 3);
    }

    public static void permutation (int n , int r){

        double permutation = factorial(n)/factorial(n-r);
        System.out.println(permutation);

    }

    public static void combination (int n , int r){
        double combination = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(combination);
    }

    public static int factorial(int n){

        int fact=1;

        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}
