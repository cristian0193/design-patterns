package patternsjava.behavioral.observer;

import static patternsjava.behavioral.observer.Status.RED;

public class Walker implements Observer{

    @Override
    public void update(TrafficLight trafficLight) {
        if (RED.equals(trafficLight.getStatus())){
            System.out.println("Peaton: Puede pasar ...");
        }else{
            System.out.println("Peaton: No puede pasar ...");
        }
    }
}
