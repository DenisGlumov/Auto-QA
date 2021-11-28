package Course2.lesson2;

import Course2.lesson2.ArrayChecker;

public class HomeWork2 {
    public static void main(String[] args) {

        String[][] arr1 = {{"2", "1", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] arr2 = {{"2", "1", "3", "4"}, {"nnh", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] arr3 = new String[5][5];
        String[][] arr4 = new String[4][4];
        ArrayChecker arrayChecker2 = new ArrayChecker();
        arrayChecker2.setStrings(arr1);
        arrayChecker2.checkLengthStrings(arr1);
        arrayChecker2.setStrings(arr2);
        arrayChecker2.checkLengthStrings(arr2);
        arrayChecker2.setStrings(arr3);
        arrayChecker2.checkLengthStrings(arr3);
        arrayChecker2.setStrings(arr4);
        arrayChecker2.checkLengthStrings(arr4);
        arrayChecker2.summ();


    }
}
