package com.chao.factory.easy_factory;

public class FruitFactoryTest {
    public static void main(String[] args) {

        FruitFactory factory = new FruitFactory();
        Apple apple = (Apple) factory.getFruit("apple");//获取苹果
        Pear pear = (Pear) factory.getFruit("pear");//获取梨
        System.out.println(apple);
        System.out.println(pear);
    }
}
