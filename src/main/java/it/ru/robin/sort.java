package it.ru.robin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort {
    //Вывести числа в порядке возрастания (убывания) значений их длины
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] mas = str.split(" ");

        for (int i = 1; i < mas.length; i++) {
            if (Integer.toString(Math.abs(Integer.parseInt(mas[i]))).length() < Integer.toString(Math.abs(Integer.parseInt(mas[i-1]))).length()) {
                swap(mas, i, i-1);
            }
        }
        System.out.println(Arrays.toString(mas));

    }

    private static void swap(String[] array, int ind1, int ind2) {
        String tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
