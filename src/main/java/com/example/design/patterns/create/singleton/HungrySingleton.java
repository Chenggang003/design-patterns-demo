package com.example.design.patterns.create.singleton;

/**
 * @author: chengang
 * @date: 2019/6/14
 * @description: 饿汉式单例
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    private static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
