package com.example.design.patterns.create.builder;

import lombok.Data;

/**
 * @author: chengang
 * @date: 2019/6/14
 * @description:
 */
@Data
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public void show(){
        System.out.println("产品的属性: partA = " + partA + ",partB=" + partB + ",partC=" + partC);
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
