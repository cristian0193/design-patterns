package patternsjava.behavioral.visitor.cards;

import patternsjava.behavioral.visitor.Visitor;
import patternsjava.behavioral.visitor.offers.FlightOffer;
import patternsjava.behavioral.visitor.offers.RestaurantOffer;

public class Classic implements Visitor {

    @Override
    public void flightOffer(FlightOffer flightOffer) {
        System.out.println("Classic: Discount 5% in flight");
    }

    @Override
    public void restaurantOffer(RestaurantOffer flightOffer) {
        System.out.println("Classic: Discount 8% in restaurant");
    }
}
