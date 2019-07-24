package com.example.design.patterns.create.factorymethod;

/**
 * @author: chengang
 * @date: 2019/6/14
 * @description:
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product showProduct() {
        return new ConcreteProduct2();
    }
}
