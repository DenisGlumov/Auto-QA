package Course1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println("Value " + 2 + 2);
        byte a = 127;
        a++;
        System.out.println(a);
        int b[][] = new int[5][5];
       // []int[] t = new int[5][5];
        int [] h[] = new int[5][5];
        int[][] c = new int[5][5];

        int e = new int[5][4].length;
        System.out.println(e);


    }

    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -100;
        int b = 200;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <=100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
