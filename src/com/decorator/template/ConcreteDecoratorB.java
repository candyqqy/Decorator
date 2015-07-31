package com.decorator.template;

/**
 * Created by qqy on 15/7/31.
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void Operation() {

        super.Operation();

        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddedBehavior() {

    }
}
