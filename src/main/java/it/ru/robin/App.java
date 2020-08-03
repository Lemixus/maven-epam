
//1. I can win!
package it.ru.robin;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        String delimeter = " ";
        String[] array = num.split(delimeter);
        int[] massiv = new int[array.length];

        for(int i = 0; i < array.length; i++) {

            massiv[i]= Integer.parseInt(array[i]);
        }
        int summary = 0;
        int mult = 1;

        for (int i=0; i < massiv.length; i++) {
            summary += massiv[i];
            mult *=massiv[i];

        }

        System.out.print(summary + "\n" + mult);




    }
}
