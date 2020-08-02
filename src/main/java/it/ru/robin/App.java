
//1. I can win!
package it.ru.robin;


import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String array[];
        String li = reader.readLine();
        String delimeter = " ";
        array = li.split(delimeter);
        for(int i= 0; i < array.length;i++){
            System.out.println(array[i]);
        }
        for(int i= 0; i < array.length;i++){
            System.out.print(array[i]+ " ");
        }


    }
}
