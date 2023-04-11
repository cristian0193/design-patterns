package patternsjava.behavioral.mediator;

public class ConcreteMediator implements Mediator{

    private Colleague1 user1;
    private Colleague2 user2;

    public void setUser1(Colleague1 user1) {
        this.user1 = user1;
    }

    public void setUser2(Colleague2 user2) {
        this.user2 = user2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(this.user1.equals(colleague)) {
            user2.message(message);
        } else if (this.user2.equals(colleague)){
            user1.message(message);
        }
    }
}
