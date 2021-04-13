package Mixed;

public class DuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuckImpl();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuckImpl();
    }

    @Override
    public Quackable createGooseDuck() {
        // TODO Auto-generated method stub
        return new GooseAdapter(new Goose());
    }
    
}
