package patternsjava.behavioral;

import static patternsjava.behavioral.memento.RunMethod.runMemento;
import static patternsjava.behavioral.PatternBehavioralTypes.*;
import static patternsjava.behavioral.chainresposability.RunMethod.runChainOfResponsibility;
import static patternsjava.behavioral.command.RunMethod.runCommand;
import static patternsjava.behavioral.iterator.RunMethod.runIterator;
import static patternsjava.behavioral.mediator.RunMethod.runMediator;
import static patternsjava.behavioral.observer.RunMethod.runObserver;

public class Main {

    public static void main(String[] args)  {

        // 1. Chain Of Responsibility
        separator(CHAIN_RESPONSIBILITY);
        runChainOfResponsibility();

        // 2. Command
        separator(COMMAND);
        runCommand();

        // 3. Iterator
        separator(ITERATOR);
        runIterator();

        // 4. Mediator
        separator(MEDIATOR);
        runMediator();

        // 5. Memento
        separator(MEMENTO);
        runMemento();

        // 6. Observer
        separator(OBSERVER);
        runObserver();
    }

    public static void separator(PatternBehavioralTypes pattern){
        System.out.println("---------------------------------------\n");
        System.out.println(pattern);
    }


}
