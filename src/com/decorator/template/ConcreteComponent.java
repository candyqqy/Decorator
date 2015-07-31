package com.decorator.template;

/**
 * Created by qqy on 15/7/31.
 */
public class ConcreteComponent extends Component {

    @Override
    public void Operation() {

        System.out.println("具体对象的操作");
    }
}
