package Mixed;

import java.util.Observable;
import java.util.Observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
