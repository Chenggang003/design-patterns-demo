package com.example.design.patterns.structure.adapter;

/**
 * @author: chengang
 * @date: 2019/7/17
 * @description: 适配者
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
