import java.util.Scanner;
class matrixaddition{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();

        int[][] mat1=new int[rows][columns];
        int[][] mat2=new int[rows][columns];
        int[][] matsum=new int[rows][columns];
        
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                mat1[j][i]=scanner.nextInt();
            }         
        }
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                mat2[j][i]=scanner.nextInt();
            }         
        }
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                matsum[j][i]=mat1[j][i]+mat2[j][i];
                System.out.println(matsum[j][i]);
            }        
        }
    }
}