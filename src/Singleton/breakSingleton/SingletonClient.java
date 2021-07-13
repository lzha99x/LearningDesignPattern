package Singleton.breakSingleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonClient {
    public static void main(String[] args) throws IOException, 
            ClassNotFoundException, NoSuchMethodException, 
            SecurityException, InstantiationException, 
            IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
        System.out.println(" -------序列化------");
        Singleton originSingleton = Singleton.getInstance();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(Singleton.getInstance());

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Singleton serializeSingleton = (Singleton) ois.readObject();
        System.out.println(originSingleton == serializeSingleton);

        System.out.println("------克隆------");
	        
	    Singleton cloneSingleton = (Singleton) originSingleton.clone();
	    System.out.println(cloneSingleton == originSingleton);//false

        System.out.println(" -------反射------");
        Constructor<Singleton> cons = Singleton.class.getDeclaredConstructor();
        cons.setAccessible(true);
        Singleton reflextSingleton = cons.newInstance();
        System.out.println(reflextSingleton == originSingleton);

        
    }
}
