package com.example.design.patterns.create.abstractfactory;

/**
 * @author: chengang
 * @date: 2019/6/14
 * @description:
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public Product1 showProduct1() {
        return new ConcreteProduct11();
    }

    @Override
    public Product2 showProduct2() {
        return new ConcreteProduct21();
    }
}
