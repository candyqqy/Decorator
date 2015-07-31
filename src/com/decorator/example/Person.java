package com.decorator.example;

/**
 * Created by qqy on 15/7/31.
 */
public class Person {

    public Person() {

    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {

        System.out.println(name);
    }
}
