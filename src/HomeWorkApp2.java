class HomeWorkApp2 {
    public static void main (String[] args) {
        System.out.println(sumNumbers(5,5 ));
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
    }

    static boolean sumNumbers(int a, int b) {
        return a + b >10 && a + b<=20? true : false;
        }

    static void numbers (int a) {
        System.out.println(a >=0 ? "Положительное" : "Отрицательное");
    }

    static boolean numberBoolean (int a) {
        return a >= 0 ? false : true;
    }

    static void numberString (String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}