package com.chao.factory.method_factory;

import com.chao.factory.easy_factory.Fruit;
import com.chao.factory.easy_factory.Pear;

/**
 * 梨类工厂
 */
public class PearFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
