package com.chao.factory.easy_factory;
/**
 * 具体产品（水果）-梨
 */
public class Pear implements Fruit {
    @Override
    public void name() {
        System.out.println("梨");
    }
}
