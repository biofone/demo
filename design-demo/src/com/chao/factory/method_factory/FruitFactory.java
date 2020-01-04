package com.chao.factory.method_factory;

import com.chao.factory.easy_factory.Fruit;

/**
 * 抽象工厂提供方法，具体生产由子类决定
 */
public interface FruitFactory {
    Fruit getFruit();
}
