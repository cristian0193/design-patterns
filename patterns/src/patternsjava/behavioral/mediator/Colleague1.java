package patternsjava.behavioral.mediator;

public class Colleague1 extends Colleague{

    Colleague1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void message(String message) {
        System.out.println("Message for user1: " + message);
    }
}
