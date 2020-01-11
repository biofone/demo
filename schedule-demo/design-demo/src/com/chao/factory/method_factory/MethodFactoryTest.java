package com.chao.factory.method_factory;

import com.chao.factory.easy_factory.Apple;
import com.chao.factory.easy_factory.Pear;


public class MethodFactoryTest {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        PearFactory pearFactory = new PearFactory();
        Apple apple = (Apple) appleFactory.getFruit();//获取苹果
        Pear pear = (Pear) pearFactory.getFruit();//获取梨
        System.out.println("method_factory:"+apple);
        System.out.println("method_factory"+pear);
    }
}
