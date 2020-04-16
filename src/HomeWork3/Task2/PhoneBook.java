package HomeWork3.Task2;

import java.util.*;

public class PhoneBook {

    Map<String, Set<String>> map = new HashMap<>();
    Set<String> set = new HashSet<>();

    public void add(String surname, String phoneNumber) {
        set.add(phoneNumber);
        map.put(surname, set);
    }

    public void get(String surname) {
        System.out.println(surname + " " + map.get(surname));
    }

}