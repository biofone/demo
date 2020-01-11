package com.chao.factory.abstract_factory;

/**
 * 屏幕接口和实现类
 */
public interface Screen {
    void size();
    class Scree5 implements Screen {
        @Override
        public void size() {
            System.out.println("5寸");
        }
    }

    class Scree6 implements Screen {
        @Override
        public void size() {
            System.out.println("6寸");
        }
    }
}
