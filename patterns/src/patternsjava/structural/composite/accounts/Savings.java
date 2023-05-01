package patternsjava.structural.composite.accounts;

import patternsjava.structural.composite.Component;

public class Savings implements Component {

    String name;
    Double amount;

    public Savings(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void showAccountName() {
        System.out.println("Savings Account: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }

}
