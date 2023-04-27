package patternsjava.behavioral.visitor;

import patternsjava.behavioral.visitor.offers.FlightOffer;
import patternsjava.behavioral.visitor.offers.RestaurantOffer;

public interface Visitor {
    void flightOffer(FlightOffer flightOffer);
    void restaurantOffer(RestaurantOffer flightOffer);
}
