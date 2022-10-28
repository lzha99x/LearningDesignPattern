package Factory.pizzas;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza(PizzaType.CHEESE);
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza.toString());

        System.out.println("-----------line------------");
        Pizza pizza2 = store.orderPizza(PizzaType.TEST);
        System.out.println(pizza2.toString());
    }
}
