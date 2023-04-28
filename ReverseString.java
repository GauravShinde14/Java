public class ReverseString {
    public static void main(String[] args) {
        String name ="gaurav";
        reverseString(name);
    }

    public static void reverseString(String str){
        // char [] strr = str.toCharArray();
         // not much of applicable in this but char can be converted to charaters of array.
         
        String stt = "";
        int i=str.length()-1;
        while( i>=0){
            stt = stt+str.charAt(i);
            i--;
        }
        System.out.println(stt);
    }
}
