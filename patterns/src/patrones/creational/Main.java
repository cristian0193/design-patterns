package patrones.creational;

import static patrones.behavioral.chainresposability.RunMethod.runChainOfResponsibility;
import static patrones.creational.PatternTypes.*;
import static patrones.creational.abstractFactory.RunMethod.runAbstractFactory;
import static patrones.creational.builder.RunMethod.runBuilder;
import static patrones.creational.factoryMethod.RunMethod.runFactoryMethod;
import static patrones.creational.prototype.RunMethod.runPrototype;
import static patrones.creational.singleton.RunMethod.runSingleton;


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
