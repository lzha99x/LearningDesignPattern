package Factory.pizzafm;



public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
    
}
