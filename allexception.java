import java.util.Scanner;

class allexception{
    public static void main(String[] args){
        try{
            int[] a=new int[-20];
        }catch(NegativeArraySizeException e){
            System.out.println(e);
        }
        try{
            int[] a=new int[2];
            a[5]=45;
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            int[] a=null;
            System.out.println(a[2]);
        }catch(NullPointerException e){
            System.out.println(e);
        }       
    }     
}
