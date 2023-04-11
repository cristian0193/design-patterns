package patternsjava.behavioral.command;

import patternsjava.behavioral.command.actions.Activate;
import patternsjava.behavioral.command.actions.Deactivate;

public class RunMethod {

    public static void runCommand() {
        CreditCard activeCard = new CreditCard();
        CreditCard deactivateCard = new CreditCard();

        Invoker invoker = new Invoker();

        invoker.setCommand(new Activate(activeCard));
        invoker.run();

        System.out.println("----------------------------------");

        invoker.setCommand(new Deactivate(deactivateCard));
        invoker.run();
    }

}
