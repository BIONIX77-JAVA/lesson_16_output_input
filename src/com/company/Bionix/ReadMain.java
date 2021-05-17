package com.company.Bionix;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadMain {
    public static void main(String[] args) {

        //        Открыть текстовый файл и прочитать из него первые 100 целых чисел, разделенных запятыми. Найти среднее значение прочитанных положительных чисел
        try (
                Scanner sc = new Scanner(
                        new FileInputStream("/home/lenovo/IdeaProjects/lesson_16_output_input/RandomNum.txt"), UTF_8.name())) {
            int count = 0;
            int sumOfEven = 0;
            int sumOfPositive = 0;
            double averageOfEven = 0;
            double averageOfPositive = 0;
            int evenCount = 0;
            int positiveCount = 0;


            Integer[] num = new Integer[100];
            sc.useDelimiter(",");
            while (count < num.length) {
                int in = sc.nextInt();
                num[count++] = in;
                if (in % 2 == 0 && in >= 0) {
                    sumOfEven += in;
                    evenCount++;
                }
                if (in >= 0) {
                    sumOfPositive += in;
                    positiveCount++;
                }
            }
            averageOfEven = (double) sumOfEven / evenCount;
            averageOfPositive = (double) sumOfPositive / positiveCount;
            System.out.println(Arrays.toString(num));
            System.out.printf("The average of all positive even - %d  numbers from the array  of %d numbers is %.1f%s", evenCount, num.length, averageOfEven, "\n");
            System.out.printf("The average of all positive - %d numbers from the array  of %d numbers is %.1f", positiveCount, num.length, averageOfPositive);
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\n");


        //        Прочитать из текстового файла список контактов, сортировать по году рождения и вывести на экран первых 5

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("ContactSimple.txt"), StandardCharsets.UTF_8))) {

            List<Contact> contactsIn1 = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                String str = reader.readLine();
                String[] subStr;
                String delimiter = "\\|";
                subStr = str.split(delimiter);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String date = subStr[3];
                LocalDate localDate = LocalDate.parse(date, formatter);
                Contact contact = new Contact(subStr[0], subStr[1], subStr[2], localDate);
                contactsIn1.add(contact);
            }

            Collections.sort(contactsIn1, contactsIn1.get(0).comparatorBirthDate);

            for (int i = 0; i < 5; i++) {
                System.out.printf("%-6s| %-10s| %-16s| %s \n", contactsIn1.get(i).name, contactsIn1.get(i)
                        .surname, contactsIn1.get(i).phoneNumber, contactsIn1.get(i).birthDate);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}