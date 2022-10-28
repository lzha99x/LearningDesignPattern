package Mixed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

public class Obervable implements QuackObservable{
    ArrayList<Observer> Observers = new ArrayList<>();
    QuackObservable duck;
    
    public Obervable(QuackObservable duck) {
        this.duck = duck;
    }
    
    @Override
    public void registerObserver(Observer observer) {
         Observers.add(observer);
        
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator =  Observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            // observer.update(duck, this);
        }
    }
    
}
