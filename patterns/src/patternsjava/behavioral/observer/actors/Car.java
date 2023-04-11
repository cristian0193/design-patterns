package patternsjava.behavioral.observer.actors;

import patternsjava.behavioral.observer.Observer;
import patternsjava.behavioral.observer.TrafficLight;

import static patternsjava.behavioral.observer.Status.RED;

public class Car implements Observer {

    @Override
    public void update(TrafficLight trafficLight) {
        if (RED.equals(trafficLight.getStatus())){
            System.out.println("Carro: No puede pasar ...");
        }else{
            System.out.println("Carro: Puede pasar ...");
        }
    }
}
