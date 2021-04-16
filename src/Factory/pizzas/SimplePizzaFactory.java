package Factory.pizzas;
/**
 * 
 * 简单工厂方法
*/
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
