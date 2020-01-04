package com.chao.factory.abstract_factory;

/**
 * cpu接口和实现类
 */
public interface Cpu {
    void run();
    class Cpu650 implements Cpu {

        @Override
        public void run() {
            System.out.println("cpu650");
        }
    }
    class Cpu825 implements Cpu {

        @Override
        public void run() {
            System.out.println("cpu825");
        }
    }
}
