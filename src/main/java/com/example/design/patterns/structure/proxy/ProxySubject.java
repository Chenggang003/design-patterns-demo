package com.example.design.patterns.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: chengang
 * @date: 2019/6/14
 * @description:
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;


    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void postRequest() {
        System.out.println("执行方法后的操作！");
    }

    private void preRequest() {
        System.out.println("执行方法前的操作！");
    }

    public static void main(String[] args) throws InterruptedException {
        /*ProxySubject proxySubject = new ProxySubject();
        proxySubject.request();*/

        Subject realSubject = new RealSubject();
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("request")) {
                    System.out.println("执行代理！");
                }
                return method.invoke(proxy, args);
            }
        });
    }
}
