package patternsjava.behavioral.command.actions;

import patternsjava.behavioral.command.Command;
import patternsjava.behavioral.command.CreditCard;

public class Deactivate implements Command {

    private CreditCard creditCard;

    public Deactivate(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.deactivateCard();
        creditCard.sendMailDeactivate();
    }
}
