package Strategy;

public class MallardDuck extends Duck{
    public  MallardDuck() {
        flyBehavior = new FlyWIthWingsImpl();
        quackBehavior = new QuackImpl();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }


}
