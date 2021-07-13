package Singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("First = " + singleton);
        System.out.println("Second = " + Singleton.getInstance());
    }
}
