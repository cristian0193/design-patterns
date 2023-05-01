package patternsjava.structural.composite.accounts;

import patternsjava.structural.composite.Component;

public class Current implements Component {

    String name;
    Double amount;

    public Current(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void showAccountName() {
        System.out.println("Current Account: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
