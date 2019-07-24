package com.example.design.patterns.create.singleton;

/**
 * @author: chengang
 * @date: 2019/6/14
 * @description: 懒汉式单例
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
