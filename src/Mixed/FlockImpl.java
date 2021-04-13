package Mixed;

import java.util.ArrayList;
import java.util.Iterator;

public class FlockImpl implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<>();

    @Override
    public void quack() {
        Iterator<Quackable> iterators = quackers.iterator();

        while (iterators.hasNext()) {
            Quackable quackable = (Quackable) iterators.next();
            quackable.quack();
        }
        
    }

    public void add (Quackable quackable) {
        quackers.add(quackable);
    }
    
}
