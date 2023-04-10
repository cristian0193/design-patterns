package patternsjava.creational.singleton;

public class RunMethod {

    public static void runSingleton() {

        Card card = Card.getInstance();
        System.out.println("Card : " + card.getNumberCard());
        card.setNumberCard("000 111 222 333");
        System.out.println("Card : " + card.getNumberCard());

    }


}
