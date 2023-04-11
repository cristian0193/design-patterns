package patternsjava.behavioral.observer;

import static patternsjava.behavioral.observer.Status.RED;

public class Car implements Observer{

    @Override
    public void update(TrafficLight trafficLight) {
        if (RED.equals(trafficLight.getStatus())){
            System.out.println("Carro: No puede pasar ...");
        }else{
            System.out.println("Carro: Puede pasar ...");
        }
    }
}
