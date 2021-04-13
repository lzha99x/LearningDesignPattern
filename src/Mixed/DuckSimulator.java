package Mixed;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        // 带有装饰器工厂方法
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        // 普通抽象工厂方法
        AbstractDuckFactory duckFactory = new DuckFactory();

        // 只关心是不是AbstractDuckFactory的子类
        simulator.simulate(countingDuckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = 
            duckFactory.createMallardDuck();
        Quackable redheadDuck = 
            duckFactory.createRedheadDuck(); 
        Quackable gooseDuck = 
            duckFactory.createGooseDuck();

        FlockImpl flockOfDucks = new FlockImpl();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(gooseDuck);

        System.out.println("\nDuck Simulator!");
        simulate(flockOfDucks);

        // simulate(mallardDuck);
        // simulate(redheadDuck);
        // simulate(gooseDuck);
         System.out.println("NumberOfQuacks = " + QuackCounterImpl.getQuacks());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
