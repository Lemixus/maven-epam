package it.ru.robin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Average {
    //Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] mas = str.split(" ");
        int sum = 0;
        double average = 0;

        //Вычисляем среднюю длину
        for (int i = 0; i < mas.length; i++){
            if(mas.length >0)
                sum += Integer.toString(Math.abs(Integer.parseInt(mas[i]))).length();
            else System.out.println("Введите массив чисел");
        }
        average = (float) sum / mas.length;
        //Основной код
        System.out.print("Среднее арифметическое: ");
        System.out.format("%.2f", average);
        String mas1 = "";
        String mas2 = "";
        for (int i = 0; i < mas.length;i++){
            if(Integer.toString(Math.abs(Integer.parseInt(mas[i]))).length() <= average)
                mas1 += mas[i] + " ";
            if (Integer.toString(Math.abs(Integer.parseInt(mas[i]))).length() > average)
                mas2 += mas[i] + " ";

        }
        System.out.println("\nМеньше: " +mas1);
        System.out.println("Больше: " +mas2);

    }
}
