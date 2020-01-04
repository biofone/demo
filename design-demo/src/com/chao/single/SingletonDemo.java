package com.chao.single;


import java.util.HashSet;
import java.util.Set;

public class SingletonDemo {
    public static void main(String[] args) throws InterruptedException {
        //懒汉式加载测试
        Single1 single1 = Single1.getInstance();
        Single1 single01 = Single1.getInstance();
        System.out.println(single1);
        System.out.println(single01);
        //饿汉式加载测试
        Single2 single2= Single2.getInstance();
        Single2 single02 = Single2.getInstance();
        System.out.println(single2);
        System.out.println(single02);

        Set<Single1> set = new HashSet<>();
        for(int i=1;i<1000;i++) {
            new Thread(() -> {
                set.add(Single1.getInstance());
            }).start();
        }
        Thread.sleep(3000);
        System.out.println("---我们的single1单例模式测试");
        for (Single1 single:set) {
            System.out.println(single);
        }

        Single4 single4= Single4.getInstance();
        Single4 single04= Single4.getInstance();
        System.out.println(single4);
        System.out.println(single04);

        Single5 single5 = Single5.getInstance();
        Single5 single05 = Single5.getInstance();
        System.out.println(single5);
        System.out.println(single05);
    }
}

/**
 * 懒汉式加载
 */
class Single1 {
    private static Single1 single;
    private Single1() {
    }
    public static Single1 getInstance() {
        if (single == null) {
            single=new Single1();
        }
        return single;
    }
}

/**
 * 饿汉式加载
 */
class Single2 {
    //类加载时实例化对象
    private static final Single2 single2= new Single2();

    private Single2() {
    }
    public static Single2 getInstance() {
        return single2;
    }


}

/**
 * synchronized同步
 */
class Single3 {
    private static Single3 single3;
    private Single3() {
    }
    public synchronized static Single3 getInstance() {
        if (single3 == null) {
            single3=new Single3();
        }
        return single3;
    }
}

/**
 * 双重锁
 */
class Single4 {
    private static volatile Single4 single4;
    private Single4() {
    }
    public static Single4 getInstance() {
        if (single4 == null) {
            synchronized (Single4.class) {
                if(single4 == null) {
                    //第一个线程实例化对象
                    single4 = new Single4();
                }
            }
        }
        return single4;
    }
}

/**
 * 静态内部类
 */
class Single5 {
    private static Single5 single5;
    private Single5() {
    }
    public static Single5 getInstance() {
        return InnerClass.single5;
    }
    //使用静态内部类，既能保证懒加载又能保证安全
    private static class InnerClass {
        private static final Single5 single5 = new Single5();
    }
}

class Single6 {
    private static Single6 single6;
    private Single6() {
    }
    public static Single6 getInstance() {
        return InnerClass.single6;
    }
    private static class InnerClass {
        private static final Single6 single6=new Single6();
    }
    public Object readResolve() {
        return InnerClass.single6;
    }
}