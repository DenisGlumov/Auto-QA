package Course1;

/**
 * HomeWorkApp2
 *
 * @author Denis Glumov
 * @version 11.09.2021
 */

class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(sumNumbers(5, 5));
        System.out.println(sumNumbers(6, 5));
        System.out.println(sumNumbers(12, 8));
        System.out.println(sumNumbers(18, 3));
        numbers(-1);
        numbers(0);
        numbers(1);
        System.out.println(numberBoolean(-1));
        System.out.println(numberBoolean(0));
        System.out.println(numberBoolean(1));
        numberString("tool", 3);
        numberString("bread", 2);
        System.out.println(years(2376));
        System.out.println(years(1600));
        System.out.println(years(1700));
        System.out.println(years(1849));
        System.out.println(years(2104));
        System.out.println(years(1984));

    }

    static boolean sumNumbers(int a, int b) {
        return a + b > 10 && a + b <= 20 ;
    }

    static void numbers(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    static boolean numberBoolean(int a) {
        return a < 0 ;
    }

    static void numberString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    static boolean years(int a) {
        if (a % 4 == 0 && a % 100 != 0 && a % 400 != 0)
            return true;

        if (a % 4 == 0 && a % 100 == 0 && a % 400 == 0)
            return true;

        return false;
    }

}