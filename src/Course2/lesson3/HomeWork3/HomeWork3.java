package Course2.lesson3.HomeWork3;

import com.sun.org.apache.xpath.internal.operations.Or;
import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        doLesson_Fruits();

        String[] array = {"Denis", "Dima", "Max", "Vika", "Oleg"};
        doLesson_Array(array, 1, 3);

        Integer[] integers = {5,4,3,2,1};
        doLesson_ArrayWithoutTemp(integers , 1, 2);
    }

    private static void doLesson_Fruits() {
        BoxFruit<Apple> appleBox = new BoxFruit<Apple>(1);
        BoxFruit<Orange> orangeBox = new BoxFruit<Orange>(1.5);
        BoxFruit<Apple> appleBox2 = new BoxFruit<Apple>(1);

        for (int i = 0; i<3; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
        System.out.println("Weight equals - " + appleBox.compare(orangeBox));

        appleBox.addFruits(appleBox2);
    }

    private static void doLesson_ArrayWithoutTemp(Integer[] integers, int i, int j) {
        int a = integers[i];
        int b = integers[j];

        a = a + b;
        b = b - a;
        b = -b;
        a = a -b;

        integers[i] = a;
        integers[j] = b;

        printArray(integers);
    }

    public static void doLesson_Array(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        printArray(array);
    }

    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }

}
