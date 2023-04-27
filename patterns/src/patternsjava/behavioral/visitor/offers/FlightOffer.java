package patternsjava.behavioral.visitor.offers;

import patternsjava.behavioral.visitor.Element;
import patternsjava.behavioral.visitor.Visitor;

public class FlightOffer implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.flightOffer(this);
    }
}
