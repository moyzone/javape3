import java.util.Scanner;
class trycatch{
    public static void main(String[] args){
       
       
        try{
            if(1<3){
                throw new MyException("Error");
            }
        }
        catch(MyException e){
            System.out.println(e);
        }
        finally{
            System.out.println("inside finally");
        }

    }
}
class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}