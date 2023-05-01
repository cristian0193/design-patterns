package patternsjava.structural.composite;

import patternsjava.structural.composite.accounts.Current;
import patternsjava.structural.composite.accounts.Savings;

public class RunMethod {

    public static void runComposite(){

        Component current = new Current("Christian", 2000.0);
        Component saving = new Savings("Luisa", 1000.0);

        Composite composite = new Composite();
        composite.addAccount(current);
        composite.addAccount(saving);

        composite.showAccountName();
        composite.getAmount();

    }

}
