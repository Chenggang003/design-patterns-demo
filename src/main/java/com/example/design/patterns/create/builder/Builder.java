package com.example.design.patterns.create.builder;

/**
 * @author: chengang
 * @date: 2019/6/14
 * @description:
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getProduct() {
        return product;
    }
}
