import java.util.Scanner;
class chessboard{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[][] box=new String[8][8];
        int count=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(count%2==0){
                    box[i][j]="WW";
                    count=count+1;
                }
                else{
                    box[i][j]="BB";
                    count=count+1;
                }
            }
            if(count%2==0){
                count=1;
            }   
            else{
                count=0;
            }     
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(box[i][j]);
            }
            System.out.println();
        }
    }
}