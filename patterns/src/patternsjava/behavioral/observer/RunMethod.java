package patternsjava.behavioral.observer;

import static patternsjava.behavioral.observer.Status.GREEN;
import static patternsjava.behavioral.observer.Status.RED;

public class RunMethod {

    public static void runObserver(){
        Publisher publisher = new Publisher();

        Walker walker = new Walker();
        publisher.subscribe(walker);

        Car car = new Car();
        publisher.subscribe(car);


        publisher.notify(new TrafficLight(RED));

        try {
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        publisher.notify(new TrafficLight(GREEN));

    }

}
