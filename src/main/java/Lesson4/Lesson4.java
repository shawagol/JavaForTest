package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Lesson4 {
    public static void main(String[] args) {
        ArrayList<String> arrWords = new ArrayList();
        arrWords.add("Франция");
        arrWords.add("Россия");
        arrWords.add("Грузия");
        arrWords.add("Франция");
        arrWords.add("Англия");
        arrWords.add("Испания");
        arrWords.add("Япония");
        arrWords.add("Китай");
        arrWords.add("Испания");
        arrWords.add("Индия");
        System.out.println("Массив: " + arrWords);

        System.out.println();
        Set<String> uniqueWords = new HashSet<>(arrWords);
        System.out.println("Уникальные слова: " + uniqueWords);


        HashMap<String, Integer> repeatWords = new HashMap<>();
        int j = 0;
        for (int i = 0; i < arrWords.size(); i++) {
            int count = 0;
            for (j = 0; j< arrWords.size();  j++) {
                if (arrWords.get(i).equals(arrWords.get(j))) {
                    count++;
                    repeatWords.put(arrWords.get(i), count);
                }
            }
        }
            System.out.println(repeatWords);



        System.out.println("Создаем справочник");
        PhoneBook phonebook = new PhoneBook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.addPhone("Иванов", "223344");
        phonebook.addPhone("Иванов", "22334411");
        phonebook.addPhone("Петров", "22334499");
        phonebook.addPhone("Сидоров", "22334488");
        phonebook.addPhone("Иванов", "22334422");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        phonebook.getPhone("Иванов");
        phonebook.getPhone("Петров");
        phonebook.getPhone("Сидоров");
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        phonebook.getPhone("Кузнецов");
        System.out.println("-----------------");


    }



}
