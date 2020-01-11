package com.chao.factory.abstract_factory;

public class MiFactory implements PhoneFactory {
    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu825();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Scree6();
    }
}
