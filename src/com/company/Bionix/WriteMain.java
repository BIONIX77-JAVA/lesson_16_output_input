package com.company.Bionix;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

public class WriteMain {

    public static void main(String[] args) {

        //Создать текстовый файл и записать в него “Hello, world!”
        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("Hello.word.txt"))) {
            writer.print("Hello World!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //        Создать текстовый файл и записать в него 1000 случайных целых чисел в диапазоне от -500 до 650, разделенных запятыми
        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("RandomNum.txt"))) {
            int w = 0;
            while (w < 1000) {
                int q = (int) ((Math.random() * 1200) - 550);
                writer.printf(q + ",");
                w++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //        Сохранить в текстовый файл список контактов (минимум 10, каждый с новой строки) в формате:Имя | Фамилия | Телефон | Год рождения

        try (
                PrintWriter writer = new PrintWriter(
                        new FileOutputStream("ContactSimple.txt"))) {
            Contact contacts[] = new Contact[]{
                    new Contact("John", "Morgan", "3980988456789", LocalDate.of(1978, 10, 7)),
                    new Contact("Anton", "Tod", "39806456788", LocalDate.of(1975, 12, 3)),
                    new Contact("Mark", "Finder", "3983453798766", LocalDate.of(1971, 10, 14)),
                    new Contact("Ioan", "Bollywood", "39867547939", LocalDate.of(1976, 10, 6)),
                    new Contact("Vlad", "Dracula", "3980987639", LocalDate.of(1555, 12, 19)),
                    new Contact("Mihael", "Shepard ", "3983447939", LocalDate.of(1955, 11, 17)),
                    new Contact("Sandra", "Ginger", "3980988046769", LocalDate.of(1966, 11, 14)),
                    new Contact("Olly", "Collins", "3980988048765", LocalDate.of(1987, 6, 20)),
                    new Contact("Bob", "Clinton", "3980988049876", LocalDate.of(1956, 7, 21)),
                    new Contact("Peter", "Bush", "398098809876", LocalDate.of(1967, 3, 5))};

            for (int i = 0; i < 10; i++) {
                writer.println(contacts[i].name + "|" + contacts[i].surname + "|" + contacts[i].phoneNumber + "|" + contacts[i].birthDate);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}