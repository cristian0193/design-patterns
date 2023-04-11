package patternsjava.behavioral.command.actions;

import patternsjava.behavioral.command.Command;
import patternsjava.behavioral.command.CreditCard;

public class Activate implements Command {

    private CreditCard creditCard;

    public Activate(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.activateCard();
        creditCard.sendMailActivate();
    }
}
