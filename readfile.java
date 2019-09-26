import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readfile{
    public static void main(String[] args){
        File file1 = new File("initial.txt");
        char CharCounter = 0;       
        try{
            BufferedReader in = new BufferedReader(new FileReader(file1));
            int ch;
            try{
                while ((ch = in.read()) != -1)
                {
                    if (Character.isLowerCase(ch))
                    {
                            ch=Character.toUpperCase(ch);// convert assign variable
                    }
                    System.out.print((char)ch);
                }
                in.close();
            }catch(IOException e){
                System.out.println("IO ");
            }
             
        }
        catch(FileNotFoundException e){
            System.out.println("not found");
        }
               
    }
}