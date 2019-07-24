package com.example.design.patterns.create.prototype;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author: chengang
 * @date: 2019/6/14
 * @description:
 */
@Data
public class RealizeType implements Cloneable {

    private Integer number;

    private List<String> list;

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        realizeType.setNumber(100);
        realizeType.setList(Arrays.asList("1"));
        RealizeType clone = (RealizeType) realizeType.clone();
        System.out.println(clone.getList() == realizeType.getList());
        System.out.println(realizeType.getList());
        System.out.println(clone.getList());
        System.out.println(clone.getNumber());
    }

}
