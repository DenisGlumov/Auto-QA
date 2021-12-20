package Course2.HomeWork4;

import java.util.*;

public class HomeWork4 {

    public static void main(String[] args) {
        //Task 1
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Name1", "Name2", "Name3", "Name4", "Name2", "Name5", "Name1", "Name6", "Name4", "Name1", "Name7",
                "Name1", "Name1"));
        arr(arrayList);

        //Task 2
        Map<String, List<Integer>> listMap = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(listMap, "Ivanov", 1111);
        phoneBook.add(listMap, "Petrov", 22222);
        phoneBook.add(listMap, "Sidorov", 33333);
        phoneBook.add(listMap, "Ivanov", 44444);
        phoneBook.add(listMap, "Ivanov", 55555);
        phoneBook.add(listMap, "Petrov", 66666);
        phoneBook.add(listMap, "Novikov", 77777);
        phoneBook.get(listMap, "Novikov");
        phoneBook.get(listMap, "Ivanov");
        phoneBook.get(listMap, "Ivanov2");
    }

    public static void arr(ArrayList<String> list) {
        Set<String> setArrayList = new LinkedHashSet<>();
        for (String a : list) {
            if (setArrayList.add(a)) {
                System.out.println("Строка: " + a + " встречалась: " + Collections.frequency(list, a));
            }
        }
        System.out.println(setArrayList);
        System.out.println("-----------------------------------");
    }
}
