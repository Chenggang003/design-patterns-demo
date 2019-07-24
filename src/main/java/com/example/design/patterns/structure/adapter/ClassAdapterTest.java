package com.example.design.patterns.structure.adapter;

/**
 * @author: chengang
 * @date: 2019/7/17
 * @description:
 */
public class ClassAdapterTest {

    public static void main(String[] args) {

        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
