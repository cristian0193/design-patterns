package patternsjava.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
