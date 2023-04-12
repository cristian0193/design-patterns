package patternsjava.behavioral.template;

public class Paypal extends Payment {
    @Override
    public void initialize() {
        System.out.println("Inicializando con Paypal...");
    }

    @Override
    public void startPayment() {
        System.out.println("Iniciando pago con Paypal...");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizando pago con Paypal...");
    }
}
