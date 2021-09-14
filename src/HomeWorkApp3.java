/**
 * HomeWorkApp3
 *
 * @author Denis Glumov
 * @version 14.09.2021
 */

import java.util.Arrays;
import java.util.Scanner;

class HomeWorkApp3 {
    public static void main(String[] args) {
        intArray();
        intArrayNull();
        intArrayMultiply();
        twoArray();
        System.out.println(arrayEnter());

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
                if (i == j || i + j == 4) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static String arrayEnter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину:");
        int len = sc.nextInt();
        System.out.println("Введите значение:");
        int initialValue = sc.nextInt();
        sc.close();
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = initialValue;
        }
        return Arrays.toString(a);

    }
}
