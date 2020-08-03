package it.ru.robin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class month {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num;
        int intnum = 0;
        boolean flag = false;
        while (flag !=true) {
            if (intnum < 1 || intnum > 12) {
                System.out.println("Введите число от 1 до 12");
                num = reader.readLine();
                intnum = Integer.parseInt(num);
            }
            else
                flag = true;
        }
        String[] month = {"Январь", "Февраль", "Март", "Апрель","Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        System.out.println(month[intnum-1]);



    }
}
