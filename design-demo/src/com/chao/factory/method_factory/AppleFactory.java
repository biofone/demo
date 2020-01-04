package com.chao.factory.method_factory;

import com.chao.factory.easy_factory.Apple;
import com.chao.factory.easy_factory.Fruit;

/**
 * 苹果类工厂
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
