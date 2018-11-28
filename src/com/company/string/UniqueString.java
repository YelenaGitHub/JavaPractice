package com.company.string;

public class UniqueString {

    // проверка уникальности строки через битовый вектор
    public static boolean isUniqueChars(String s) {
        int checker = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a'; // symbol indexes start from a - 0, b - 1, ....
            if ((checker & (1 << val)) > 0) { // get i-th bit from a checker
                System.out.println("String is not unique, duplicate symbol is " + s.charAt(i));
                return false;
            }
        checker |= (1 << val); // set i-th bit in a checker
        }
        System.out.println("String is unique");
        return true;
    }

}
