package patrones.creational.builder;

public class RunMethod {

    public static void runBuilder()  {
        Card.CardBuilder card = new Card.CardBuilder().type("VISA").number("000 111 222 333").name("CHRISTIAN").expiration(2024).isCredit(false);
        System.out.println(card.build().toString());

        Card.CardBuilder card2 = new Card.CardBuilder().type("VISA").number("000 111 222 333");
        System.out.println(card2.build().toString());
    }

}
