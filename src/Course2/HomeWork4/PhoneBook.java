package Course2.HomeWork4;

import java.util.*;

public class PhoneBook {
    private int number;
    private String lastname;

    @Override
    public int hashCode() {
        return Objects.hashCode(lastname);
    }

    public void add(Map<String, List<Integer>> map , String lastname, int number) {
        map.computeIfAbsent(lastname, k -> new ArrayList<>()).add(number);
        System.out.println("Телефон: " + number + " добавлен");

    }

    public void get(Map<String, List<Integer>> map, String key) {
        System.out.println("По фамилии: " + key + " найдено " + map.get(key));
    }


}
