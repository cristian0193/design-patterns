package patternsjava.behavioral;

import static patternsjava.behavioral.interpreter.RunMethod.runExpressions;
import static patternsjava.behavioral.memento.RunMethod.runMemento;
import static patternsjava.behavioral.PatternBehavioralTypes.*;
import static patternsjava.behavioral.chainresposability.RunMethod.runChainOfResponsibility;
import static patternsjava.behavioral.command.RunMethod.runCommand;
import static patternsjava.behavioral.iterator.RunMethod.runIterator;
import static patternsjava.behavioral.mediator.RunMethod.runMediator;
import static patternsjava.behavioral.observer.RunMethod.runObserver;
import static patternsjava.behavioral.state.RunMethod.runState;
import static patternsjava.behavioral.strategy.RunMethod.runStrategy;
import static patternsjava.behavioral.template.RunMethod.runTemplate;
import static patternsjava.behavioral.visitor.RunMethod.runVisitor;

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

        // 7. State
        separator(STATE);
        runState();

        // 8. Interpreter
        separator(INTERPRETER);
        runExpressions();

        // 9. Strategy
        separator(STRATEGY);
        runStrategy();

        // 10. Template Method
        separator(TEMPLATE);
        runTemplate();

        // 11. Visitor
        separator(VISITOR);
        runVisitor();
    }

    public static void separator(PatternBehavioralTypes pattern){
        System.out.println("---------------------------------------\n");
        System.out.println(pattern);
    }


}
