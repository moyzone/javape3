import java.util.Scanner;
class StudentMarks{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int numOfStudents=scanner.nextInt();
        int[] stuGrades=new int[numOfStudents];
        for(int i=0;i<numOfStudents;i++){
            int dummy=scanner.nextInt();
            if(dummy>100 || dummy<0){
                throw new ArithmeticException("Error");
            }
            else{
                stuGrades[i]=dummy;
            }
        }
    }
}