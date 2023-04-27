package patternsjava.behavioral.visitor.offers;

import patternsjava.behavioral.visitor.Element;
import patternsjava.behavioral.visitor.Visitor;

public class RestaurantOffer implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.restaurantOffer(this);
    }

}
