package patternsjava.behavioral.mediator;

public class Colleague2 extends Colleague{

    Colleague2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void message(String message) {
        System.out.println("Message for user2: " + message);
    }
}
