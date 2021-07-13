package Singleton.breakSingleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
    
    private static volatile Singleton instance;
    private static volatile boolean isCreate = false;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return  instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }

    /**
     * 构造方法私有化，外部不能new.
    */
    private Singleton() {
        if (isCreate) {
            throw new RuntimeException("已然被实例化一次，不能在实例化");
        }
        isCreate = true;
     }

     // 防止序列化破坏.
    private Object readResolve() {
        return instance;
    }
}
