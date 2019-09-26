import java.util.Scanner;
class consecutive{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String numbers=scanner.nextLine();    
        String[] individual=numbers.split(",");
        int dummy= (char)Integer.parseInt(individual[0]);
        // System.out.println(dummy);
        boolean flag=true;
        for(int i=1;i<individual.length;i++){
            if((char)Integer.parseInt(individual[i])!=dummy+1){
                flag=false;
                break;
            }
            dummy=(char)Integer.parseInt(individual[i]);
        }
        if(flag==false){
            System.out.println("Not consecutive");
        }        
        else{
            System.out.println("Consecutive");
        }
    }
}