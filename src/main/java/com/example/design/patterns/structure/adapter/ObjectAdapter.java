package com.example.design.patterns.structure.adapter;

/**
 * @author: chengang
 * @date: 2019/7/17
 * @description: 对象适配器
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
