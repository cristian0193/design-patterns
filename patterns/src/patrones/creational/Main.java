package patrones.creational;

import static patrones.creational.abstractFactory.RunMethod.runAbstractFactory;
import static patrones.creational.builder.runMethod.runBuilder;
import static patrones.creational.factoryMethod.RunMethod.runFactoryMethod;


public class Main {

    public static void main(String[] args)  {

        separator();

        // 1. Factory Method
        runFactoryMethod();
        separator();

        // 2. Abstract Factory
        runAbstractFactory();
        separator();

        // 3. Builder
        runBuilder();
        separator();

    }

    public static void separator(){
        System.out.println("---------------------------------------");
    }

}
