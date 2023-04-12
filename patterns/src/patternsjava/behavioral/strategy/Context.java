package patternsjava.behavioral.strategy;

public class Context {

    private FormatText formatText;

    public Context(FormatText format){
        this.formatText = format;
    }

    public void publisherStrategy(String text){
        formatText.format(text);
    }

}
