public class VowelOrConsonant {
    public static void main(String[] args) {
        
        String name ="gaurav";
        voc(name);
    }

    public static void voc(String str){
        String vowel = "";
        String consonents ="";

        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='a'||str.charAt(i)== 'e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowel = vowel+str.charAt(i);
            }else{
                consonents = consonents+str.charAt(i);
            }

            i++;
        }

        System.out.println(vowel);
        System.out.println(consonents);
    }
}
