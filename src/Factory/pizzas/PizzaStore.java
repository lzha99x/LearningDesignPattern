package Factory.pizzas;

public class PizzaStore {
    SimplePizzaFactory factory;
    // 通过简单工厂方法构造Pizza的实例
    public  PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}
