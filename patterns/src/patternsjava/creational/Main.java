package patternsjava.creational;

import static patternsjava.behavioral.chainresposability.RunMethod.runChainOfResponsibility;
import static patternsjava.creational.PatternTypes.*;
import static patternsjava.creational.abstractFactory.RunMethod.runAbstractFactory;
import static patternsjava.creational.builder.RunMethod.runBuilder;
import static patternsjava.creational.factoryMethod.RunMethod.runFactoryMethod;
import static patternsjava.creational.prototype.RunMethod.runPrototype;
import static patternsjava.creational.singleton.RunMethod.runSingleton;


public class Main {

    public static void main(String[] args)  {

        // 1. Factory Method
        separator(FACTORY_METHOD);
        runFactoryMethod();

        // 2. Abstract Factory
        separator(ABSTRACT_FACTORY);
        runAbstractFactory();

        // 3. Builder
        separator(BUILDER);
        runBuilder();

        // 4. Prototype
        separator(PROTOTYPE);
        runPrototype();

        // 4. Singleton
        separator(SINGLETON);
        runSingleton();

        // 5. Chain Of Responsibility
        separator(CHAIN_RESPONSIBILITY);
        runChainOfResponsibility();
    }

    public static void separator(PatternTypes pattern){
        System.out.println("---------------------------------------\n");
        System.out.println(pattern);
    }

}
