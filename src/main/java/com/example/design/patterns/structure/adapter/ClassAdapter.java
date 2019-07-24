package com.example.design.patterns.structure.adapter;

/**
 * @author: chengang
 * @date: 2019/7/17
 * @description: 类适配器
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
