
//1
package it.ru.robin;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] mas = str.split(" ");

        int MinLength =1000000000;
        int flagMin = MinLength;
        long MaxLength = 0;
        long flagMax = 0;
        int min = MinLength;
        long max = 0;



        for(int i = 0; i < mas.length;i++){
            MinLength = Math.min(MinLength, Integer.toString(Math.abs(Integer.parseInt(mas[i]))).length());
            if(MinLength < flagMin) {
                flagMin = MinLength;
                min = Integer.parseInt(mas[i]);
            }


            MaxLength = Math.max(MaxLength, Integer.toString(Math.abs(Integer.parseInt(mas[i]))).length());
            if (MaxLength > flagMax) {
                flagMax = MaxLength;
                max = Integer.parseInt(mas[i]);
            }


        }


        System.out.println("Минимальная длина " + MinLength + " у числа " + min);
        System.out.println("Макисимальная длина " + MaxLength + " у числа " + max);



    }
}
