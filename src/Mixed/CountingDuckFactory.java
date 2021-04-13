package Mixed;

public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        // TODO Auto-generated method stub
        return new QuackCounterImpl(new MallardDuckImpl());
    }

    @Override
    public Quackable createRedheadDuck() {
        // TODO Auto-generated method stub
        return new QuackCounterImpl(new RedheadDuckImpl());
    }

    @Override
    public Quackable createGooseDuck() {
        // TODO Auto-generated method stub
        return new QuackCounterImpl(new GooseAdapter(new Goose()));
    }
    
}
