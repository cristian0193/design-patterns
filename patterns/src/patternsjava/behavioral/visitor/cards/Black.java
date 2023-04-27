package patternsjava.behavioral.visitor.cards;

import patternsjava.behavioral.visitor.Visitor;
import patternsjava.behavioral.visitor.offers.FlightOffer;
import patternsjava.behavioral.visitor.offers.RestaurantOffer;

public class Black implements Visitor {
    @Override
    public void flightOffer(FlightOffer flightOffer) {
        System.out.println("Black: Discount 10% in flight");
    }

    @Override
    public void restaurantOffer(RestaurantOffer flightOffer) {
        System.out.println("Black: Discount 15% in restaurant");
    }
}
