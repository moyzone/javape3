import java.util.Scanner;
class removevowels{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] place=new String[5];

        for(int i=0;i<5;i++){
            place[i]=scanner.nextLine();
            place[i]=place[i].replaceAll("[aeiou]", "");
        }
        for(int i=0;i<5;i++){
            System.out.println(place[i]);
        }
        
    }
}