package com.decorator.example;

import com.decorator.example.dressup.BigTrouser;
import com.decorator.example.dressup.Sneakers;
import com.decorator.example.dressup.TShirts;

/**
 * Created by qqy on 15/7/31.
 */
public class main {

    public static void main(String[] args) {

        Person person = new Person("QQY");
        TShirts dt = new TShirts();
        BigTrouser db = new BigTrouser();
        Sneakers ds = new Sneakers();

        dt.setPerson(person);
        db.setPerson(dt);
        ds.setPerson(db);
        ds.show();

    }
}
