public class MatrixMultiplication {
    public static void main(String[] args) {

        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
int b[][]={{1,1,1},{2,2,2},{3,3,3}}; 
matrixMultiplication(a, b, 3, 3);   
        
    }


    public static void matrixMultiplication(int mat1 [][],int mat2[][],int rows, int col){
        int mati [][] = new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j =0;j<col;j++){
                mati[i][j]=0;

                for(int k=0;k<rows;k++){
                    mati[i][j] = mati[i][j]+mat1[i][k]*mat2[k][j];
                }

                System.out.print(mati[i][j]+" ");

            }
            System.out.println();
        }


    }
}
