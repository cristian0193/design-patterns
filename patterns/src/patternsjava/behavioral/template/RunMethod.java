package patternsjava.behavioral.template;

public class RunMethod {

    public static void runTemplate(){
        Payment payment1 = new Paypal();
        payment1.makePayment();

        Payment payment2 = new Visa();
        payment2.makePayment();
    }

}
