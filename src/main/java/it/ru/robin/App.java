
//1. I can win!
package it.ru.robin;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter aray length: ");
        String ssize = reader.readLine();
        int size = Integer.parseInt(ssize);
        String massiv[]=new String[size];
        System.out.println("Enter value of array: ");
        for(int i=0; i < size; i++){
            massiv[i] = reader.readLine();
        }
        String array="";
        for(int i=size-1; i >=0; i--){
            array = array + " " + massiv[i];
        }

        System.out.println("Reverse array: "+ array);

    }
}
