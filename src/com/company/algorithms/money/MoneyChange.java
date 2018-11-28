package com.company.algorithms.money;

import java.util.ArrayList;

public class MoneyChange {

    public final static int[] COINS = {1, 3, 4};
    public final static int SUM = 10;
    public static int[] arr = new int[SUM];

    // динамическое программирование размен монет
    public static void solve(int n){
        // fixme test
        n = SUM;
        arr[0] = 0;

        if (n < 0) {
            throw new IllegalArgumentException();
        }

        // O() = x * c
        // проходим по различным суммам
        for (int x = 1; x <= n; x++){
            System.out.println("x: " + x);
            // проходим по монетам
            for (int c: COINS){
                if (x - c > 0){
                    arr[x] = Math.min(arr[x], arr[x-c] + 1);
                    System.out.println("arr[x]: " + arr[x]);
                }
            }
        }

    }
}
