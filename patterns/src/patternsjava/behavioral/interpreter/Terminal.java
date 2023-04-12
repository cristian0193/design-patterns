package patternsjava.behavioral.interpreter;

public class Terminal implements Expression{

    private String text;

    public Terminal(String text) {
        this.text = text;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(text);
    }
}
