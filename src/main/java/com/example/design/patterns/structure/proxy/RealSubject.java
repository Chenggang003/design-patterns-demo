package com.example.design.patterns.structure.proxy;

/**
 * @author: chengang
 * @date: 2019/6/14
 * @description:
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真正主题的方法！");
    }
}
