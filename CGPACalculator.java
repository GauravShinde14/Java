public class CGPACalculator {
    public static void main(String[] args) {

        double[] marks
            = { 90, 80, 70, 80, 90 };
            int sub = 5;
        calc(marks, sub);
        
    }

    public static void calc(double[] marks,int subjects){

        double[] grade = new double[subjects];
        double sum=0;
        double cgpa;

        for(int i =0;i<subjects ;i++){
            grade[i] = (marks[i]/10);
        }

        for(int i=0;i<subjects;i++){
            sum = sum+grade[i];
        }
        
        cgpa = sum/subjects;
        System.out.println(cgpa);
    }
}
