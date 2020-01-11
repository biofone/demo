package com.chao.factory.easy_factory;

/**
 * 具体工厂，根据需求生产具体产品
 */
public class FruitFactory {
    public Fruit getFruit(String type) {
        if(type.equals("apple")) {
            return new Apple();//获得苹果
        } else if(type.equals("pear")) {
            return new Pear();//获得梨
        }
        return null;
    }
}
