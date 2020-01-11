package com.chao.factory.easy_factory;

/**
 * 具体产品（水果）-苹果
 */
public class Apple implements Fruit {
    @Override
    public void name() {
        System.out.println("苹果");
    }
}
