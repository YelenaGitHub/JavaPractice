package com.company.concurrency;

import com.company.concurrency.dto.Account;

public class AccountOperation {

    public void transferCash(Account account1, Account account2, double amount){
        Account firstLock, secondLock;
        if (account1.getId() < account2.getId()) {
            firstLock = account1;
            secondLock = account2;
        } else {
            firstLock = account2;
            secondLock = account1;
        }

        synchronized (firstLock){
            synchronized (secondLock) {
                if (firstLock.isEnoughBalance()) {
                    firstLock.setDebit(firstLock.getDebit() - amount);
                    secondLock.setDebit(secondLock.getDebit() + amount);
                }
            }
        }


    }

}
