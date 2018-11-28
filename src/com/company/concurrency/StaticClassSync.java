package com.company.concurrency;

public class StaticClassSync {

    private String s = "abc";

    public void sync() {
        synchronized (String.class) {
            // fixme under development

        }

    }
}
