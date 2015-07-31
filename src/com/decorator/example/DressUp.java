package com.decorator.example;

/**
 * Created by qqy on 15/7/31.
 */
public class DressUp extends Person {

    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void show() {

        if (person != null) {
            person.show();
        }
    }
}
