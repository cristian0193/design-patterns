package patternsjava.behavioral.observer;

public interface Subject {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notify(TrafficLight trafficLight);
}
