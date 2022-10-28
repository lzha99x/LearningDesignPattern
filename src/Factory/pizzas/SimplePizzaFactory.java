package Factory.pizzas;
/**
 * 
 * 简单工厂方法
*/
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case PizzaType.CHEESE:
                pizza = new CheesePizza();
            break;
        }
        return pizza;
    }
}
