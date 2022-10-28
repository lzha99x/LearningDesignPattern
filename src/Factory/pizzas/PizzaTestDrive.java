package Factory.pizzas;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza(PizzaType.CHEESE);
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza.toString());
    }
}
