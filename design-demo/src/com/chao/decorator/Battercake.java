package com.chao.decorator;

public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼果子";
    }

    @Override
    protected int cost() {
        return 5;
    }
}
