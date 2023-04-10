package patternsjava.creational.abstractFactory;

public interface AbstractFactory<T> {
    T create(String type);
}
