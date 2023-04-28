public class AvgMarks {
    public static void main(String[] args) {
        
        double[] marks
            = { 90, 80, 70, 80, 90 };
            int sub = 5;
       avgmarkscal(marks, sub); 
    }

    public static void avgmarkscal (double [] marks,int subject){
        double sum =0;
        double avg ;

        for(int i=0;i<marks.length;i++){
            sum = sum+marks[i];
        }
        avg = sum/subject;
        System.out.println(avg);
    }
}
