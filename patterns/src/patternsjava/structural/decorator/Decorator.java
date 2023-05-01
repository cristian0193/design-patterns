package patternsjava.structural.decorator;

public class Decorator implements Credit{

    protected Credit credit;

    public Decorator(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void showCredit() {
        credit.showCredit();
    }
}
