package patrones.creational.builder;

public class Card {

    private final String type;
    private final String number;
    private final String name;
    private final int expiration;
    private final boolean credit;

    private Card(CardBuilder cardBuilder){
        this.type = cardBuilder.type;
        this.number = cardBuilder.number;
        this.name = cardBuilder.name;
        this.expiration = cardBuilder.expiration;
        this.credit = cardBuilder.credit;
    }

    @Override
    public String toString() {
        return "CARD : " + this.type + " " + this.number + " " + this.name + " " + this.expiration + " " + this.credit;
    }

    public static class CardBuilder {
        private String type;
        private String number;
        private String name;
        private int expiration;
        private boolean credit;

        public CardBuilder type(String type){
            this.type = type;
            return this;
        }

        public CardBuilder number(String number){
            this.number = number;
            return this;
        }

        public CardBuilder name(String name){
            this.name = name;
            return this;
        }

        public CardBuilder expiration(int expiration){
            this.expiration = expiration;
            return this;
        }

        public CardBuilder isCredit(boolean credit){
            this.credit = credit;
            return this;
        }

        public Card build(){
            return new Card(this);
        }

    }

}
