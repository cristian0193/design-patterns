package patternsjava.behavioral.visitor;

import patternsjava.behavioral.visitor.cards.Black;
import patternsjava.behavioral.visitor.cards.Classic;
import patternsjava.behavioral.visitor.offers.FlightOffer;
import patternsjava.behavioral.visitor.offers.RestaurantOffer;

public class RunMethod {

    public static void runVisitor(){
        Element restaurant = new RestaurantOffer();
        restaurant.accept(new Black());

        Element flight = new FlightOffer();
        flight.accept(new Classic());
    }

}
