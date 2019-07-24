package com.example.design.patterns.structure.adapter;

/**
 * @author: chengang
 * @date: 2019/7/17
 * @description:
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        System.out.println("对象适配器测试：");
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        objectAdapter.request();
    }
}
