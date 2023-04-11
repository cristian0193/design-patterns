package patternsjava.behavioral.iterator;

public class RunMethod {

    public static void runIterator(){

        Card[] cards = new Card[5];
        cards[0] = new Card("VISA");
        cards[1] = new Card("MASTERCARD");
        cards[2] = new Card("AMERICA EXPRESS");
        cards[3] = new Card("GOOGLE CARD");
        cards[4] = new Card("APPLE CARD");

        List list = new CardList(cards);
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Card card = (Card) iterator.next();
            System.out.println(card.getType());
        }
    }

}
