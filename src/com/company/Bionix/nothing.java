package com.company.Bionix;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class nothing {

//    Collection<Contact> contacts = Arrays.asList(
//            new Contact("John", "Morgan", "3980988456789", "30.12.1986"),
//            new Contact("Anton", "Todesky", "39806456788", "30.08.1984"),
//            new Contact("Mark", "Finder", "3983453798766", "30.09.1976"),
//            new Contact("Ioan", "Bollywood", "39867547939", "30.12.1956"),
//            new Contact("Rob", "Milton", "3980987639", "30.11.1998"),
//            new Contact("Mihael", "Shepard ", "3983447939", "30.10.1909"),
//            new Contact("Sandra", "Ginger", "3980988046769", "30.09.1976"),
//            new Contact("Olly", "Collins", "3980988048765", "30.06.1987"),
//            new Contact("Bob", "Clinton", "3980988049876", "30.04.1978"),
//            new Contact("Peter", "Bush", "398098809876", "30.01.1956"));
//
//
//    FileWriter fileWriter = null;
//        try {
//        fileWriter = new FileWriter("Contact.txt");
//        PrintWriter printWriter = new PrintWriter(fileWriter);
//        contacts.forEach(contact -> printWriter.println(contact));
//        printWriter.close();
//    } catch (
//    IOException e) {
//        e.printStackTrace();
//    }
//
//
//        try (
//    PrintWriter writer = new PrintWriter(
//            new FileOutputStream("ContactSimple.txt"))) {
//        Contact contact1 = new Contact("John", "Morgan", "3980988456789", "30.12.1986");
//        Contact contact2 = new Contact("Anton", "Todesky", "39806456788", "30.08.1984");
//        Contact contact3 = new Contact("Mark", "Finder", "3983453798766", "30.09.1976");
//        Contact contact4 = new Contact("Ioan", "Bollywood", "39867547939", "30.12.1956");
//        Contact contact5 = new Contact("Rob", "Milton", "3980987639", "30.11.1998");
//        Contact contact6 = new Contact("Mihael", "Shepard ", "3983447939", "30.10.1909");
//        Contact contact7 = new Contact("Sandra", "Ginger", "3980988046769", "30.09.1976");
//        Contact contact8 = new Contact("Olly", "Collins", "3980988048765", "30.06.1987");
//        Contact contact9 = new Contact("Bob", "Clinton", "3980988049876", "30.04.1978");
//        Contact contact10 = new Contact("Peter", "Bush", "398098809876", "30.01.1956");
//
//        writer.println(contact1);
//        writer.println(contact2);
//        writer.println(contact3);
//        writer.println(contact4);
//        writer.println(contact5);
//        writer.println(contact6);
//        writer.println(contact7);
//        writer.println(contact8);
//        writer.println(contact9);
//        writer.println(contact10);
//
//
////        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
////                new FileOutputStream("Contact.txt")
////        )) {
////            for (Contact contact : contacts) {
////                objectOutputStream.writeObject(contact.toString());
////         }
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        }


//
//       try (
//    Scanner sco = new Scanner(
//            new FileInputStream("/home/lenovo/IdeaProjects/lesson_16_output_input/Contact.txt"), StandardCharsets.UTF_8.name())) {
//        List<Object> contacts = new ArrayList<>();
//        while (sco.hasNext()) {
//            contacts.add(sco.nextLine()+"\n");
//        }
//        for (Object contact : contacts) {
//            System.out.print(contact);
//        }
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    }


//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader(
//                    "ContactSimple.txt"));
//            String line = reader.readLine();
//            List<Contact> contacts = new ArrayList<>();
//            while (line != null) {
//                contacts.add(new Contact(line));
//                line = reader.readLine();
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try (InputStreamReader reader1 = new InputStreamReader(
//                new FileInputStream("ContactSimple.txt"))) {
//            {
//                Contact contacts[] = new Contact[10];
//                for (int i = 0; i < contacts.length; i++) {
//                    contacts[i] = (reader1.read());
//                }
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//            Contact[]contactsIn1 = new Contact[10];
//            for (int i =0; i<10; i++) {
//                String[] s = (reader.readLine().split(","));
//                contactsIn1[i].name = s[0];
//                contactsIn1[i].surname = s[1];
//                contactsIn1[i].phoneNumber = s[2];
//                contactsIn1[i].birthDate = s[3];
//            }
//
//
//            for (Contact contact : contactsIn1) {
//                String[] s = (reader.readLine().split(","));
//                contact.name = s[0];
//                contact.surname = s[1];
//                contact.phoneNumber = s[2];
//                contact.birthDate = s[3];
//            }
//            System.out.println(contactsIn1);
//
//            for (Contact contact : contactsIn1) {
//                System.out.println(contact.name + " | " + contact.surname + " | " + contact.phoneNumber + " | " + contact.birthDate);
//            }
//
//              Ещё один пример разделения
////            System.out.println("\nПример 2:");
////            str = "разделить.строку.по разделителю";
////            delimeter = "\\."; // Разделитель
////            subStr = str.split(delimeter);
////            // Вывод результата на экран
////            for(int i = 0; i < subStr.length; i++) {
////                System.out.println(subStr[i]);
////            }
////
////            // Ещё один пример разделения с использованием порога
////            System.out.println("\nПример 3:");
////            str = "разделить!строку!по!разделителю";
////            delimeter = "!"; // Разделитель
////            subStr = str.split(delimeter, 3); // Разбить строку str с порогом равным 3, который означает, как много подстрок, должно быть возвращено.
////            // Вывод результата на экран
////            for(int i = 0; i < subStr.length; i++) {
////                System.out.println(subStr[i]);
////            }
////
//
////          TRY 1
////            List<String> contactsIn = new ArrayList<>();
////            for(int i = 0; i<10; i++){
////                contactsIn.add(i, Arrays.toString(reader.readLine().split(",")));
////            }
////            for (String s : contactsIn) {
////                System.out.println(s);
////            }
//
////          TRY 2
////            List<Contact> contactsIn1 = new ArrayList<>();
////            String line;
////            while ((line = reader.readLine()) != null) {
////                String[] m = line.split(",");
////                contactsIn1.add(new Contact(m[0], m[1], m[2], m[3]));
////                for (Contact contact : contactsIn1) {
////                    System.out.println(contact.name + " | " + contact.surname + " | " + contact.phoneNumber + " | " + contact.birthDate);
////                }
////            }

//            (String s= contactsIn1.get(0).birthDate;
//            SimpleDateFormat format = new SimpleDateFormat();
//            format.applyPattern("dd.MM.yyyy");
//            Date docDate= format.parse(s);
//            System.out.println(docDate);
}