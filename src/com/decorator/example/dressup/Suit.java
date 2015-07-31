package com.decorator.example.dressup;

import com.decorator.example.DressUp;

/**
 * Created by qqy on 15/7/31.
 */
public class Suit extends DressUp {

    @Override
    public void show() {
        super.show();
        System.out.print("西装 ");
    }
}
