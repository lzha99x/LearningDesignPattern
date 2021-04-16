package Factory.pizzas;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        StringBuffer disply = new StringBuffer();
        disply.append("---- " + name + " ----" + "\n");
        disply.append(dough + "\n");
        disply.append(sauce + "\n");
        for (String topping: toppings) {
            disply.append(topping + "\n");
        }
        return disply.toString();
    }
}
