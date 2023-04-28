public class Armstrong {
    public static void main(String[] args) {
        armstrongNumber(153);
    }

    public static void armstrongNumber(int n){

        int lastdigit, temp , digit = 0;
        double sum=0 ;

        //finding no of digits
        temp =n;
        while(temp>0){
            temp = temp/10;
            digit++;
        }

        //now find actual digits 
        temp =n;// getting actual vaulue of n and storing it into temp variable
        while(temp>0){
            lastdigit = temp%10;

            sum = sum+Math.pow(lastdigit, digit);
            temp = temp/10;//  removing last digit

        }

        if(n==sum){
            System.out.println(n+" is amstrong");
        }else{
            System.out.println("Not amstrong");
        }


    }
}
