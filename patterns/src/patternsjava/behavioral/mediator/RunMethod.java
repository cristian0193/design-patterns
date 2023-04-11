package patternsjava.behavioral.mediator;

public class RunMethod {

    public static void runMediator(){
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Colleague1 user1 = new Colleague1(concreteMediator);
        Colleague2 user2 = new Colleague2(concreteMediator);

        concreteMediator.setUser1(user1);
        concreteMediator.setUser2(user2);

        user1.send("Hello 1");
        user2.send("Hello 2");
    }

}
