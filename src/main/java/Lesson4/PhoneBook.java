package Lesson4;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> phoneBook;
    public  PhoneBook(){
        this.phoneBook=new HashMap<>();
    }

    public void addPhone (String name, String number) {
        if (phoneBook.get(name)==null) {
            phoneBook.put(name, new HashSet<String>());
        }
        phoneBook.get(name).add(number);

    }

     public void getPhone(String name) {
        System.out.println("Контакт: " + name + ". Номер телефона: " + phoneBook.getOrDefault(name, new HashSet<>()));
}
}
