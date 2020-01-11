package com.chao.factory.abstract_factory;

public class Mi2Factory implements PhoneFactory {
    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu650();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Scree5();
    }
}
