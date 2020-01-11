package com.chao.factory.abstract_factory;

public interface PhoneFactory {
    Cpu getCpu();//使用的cpu
    Screen getScreen();//使用的屏幕
}
