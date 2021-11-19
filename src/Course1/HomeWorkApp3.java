package Course1;
/**
 * HomeWorkApp3
 *
 * @author Denis Glumov
 * @version 15.09.2021
 */

import java.util.Arrays;
import java.util.Scanner;

class HomeWorkApp3 {
    public static void main(String[] args) {
        intArray();
        intArrayNull();
        intArrayMultiply();
        twoArray();
        System.out.println(Arrays.toString(newArray(3, 5)));
        sortArray();
        int[] oneArray = {1, 1, 1, 2, 1};
        int[] twoArray = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(oneArray));
        System.out.println(checkBalance(twoArray));
        int[] oneShift = {1, 2, 3};
        int[] twoShift = {3, 5, 6, 1};
        System.out.println(Arrays.toString(shiftArray(oneShift, 1)));

    }

    static void intArray() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {  //Почемуто не смог сделать через тернальный оператор a[i]==1? a[i]=0 : a[i]=1; Выдавал ошибку - Variable expected
            if (a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void intArrayNull() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;

        }
        System.out.println(Arrays.toString(a));
    }

    static void intArrayMultiply() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void twoArray() {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j || i + j == a.length - 1) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Оставлю для себя. Как пример работы через консоль
     * static String arrayEnter() {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Введите длину:");
     * int len = sc.nextInt();
     * System.out.println("Введите значение:");
     * int initialValue = sc.nextInt();
     * sc.close();
     * int[] a = new int[len];
     * for (int i = 0; i < a.length; i++) {
     * a[i] = initialValue;
     * }
     * return Arrays.toString(a);
     * <p>
     * }
     */

    static int[] newArray(int len, int initialValue) {
        int[] a = new int[len];
        Arrays.fill(a, initialValue);
        return a;
    }

    static void sortArray() {
        int[] a = {3, 35, 66, 1, -2, 108, 67, 24};
        Arrays.sort(a);
        System.out.println("Минимальное значение " + a[0]);
        System.out.println("Максимальное значение " + a[a.length - 1]);

    }

    static boolean checkBalance(int[] arr) {
        int left = 0;
        int right = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            left += arr[i];
        }
        for (int i = arr.length - 2; i > 0; i--) {
            if (left > right) {
                left -= arr[i];
                right += arr[i];
            }
            if (left == right) {
                break;
            }
        }
        System.out.println("Левая часть " + left);
        System.out.println("Правая часть " + right);
        return left == right;
    }

    static int[] shiftArray(int[] arr, int n) {
        int b = arr[n];
        for (int i = 0; i < arr.length; i += 1 + n) {
            arr[(i + n) % arr.length] = arr[i];
        }
        arr[(n + n) % arr.length] = b;
        return arr;
    }

}
