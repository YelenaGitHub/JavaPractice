package com.company.concurrency.dto;

public class Account {

    private int id;
    private double debit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public boolean isEnoughBalance(){
        return debit > 0;
    }
}
