package patternsjava.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notify(TrafficLight trafficLight) {
        for (Observer o: observers) {
            o.update(trafficLight);
        }
    }
}
