package Mixed;

public class QuackCounterImpl implements Quackable{
    Quackable duck;
    static int numberOfQuacks = 0;

    public QuackCounterImpl(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        duck.quack();
        numberOfQuacks++;
    }
    
    public static int getQuacks() {
        return numberOfQuacks;
    }
}
