package Strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFLy();
        mallard.performQuack();
    }
}