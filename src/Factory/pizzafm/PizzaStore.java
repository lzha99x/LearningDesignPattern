package Factory.pizzafm;

public abstract class PizzaStore {
    /**
     * 客户中关于超类的代码和子类对象创建代码解耦
    */
    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("---- Making a " + pizza.getName() + " ----");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
