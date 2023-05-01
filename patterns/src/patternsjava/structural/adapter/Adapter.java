package patternsjava.structural.adapter;

import patternsjava.structural.adapter.cards.Black;
import patternsjava.structural.adapter.cards.Gold;

public class Adapter implements Payment{

    Secure secure;

    public Adapter(CardsTypes type) {
        if(CardsTypes.BLACK.equals(type)){
            secure = new Black();
        } else {
            secure = new Gold();
        }
    }

    @Override
    public void Pay(CardsTypes type) {
        if(CardsTypes.BLACK.equals(type)){
            secure.SecureLevelA();
        } else {
            secure.SecureLevelZ();
        }
    }
}
