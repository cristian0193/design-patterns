package patternsjava.behavioral.template;

public class Visa extends Payment {
    @Override
    public void initialize() {
        System.out.println("Inicializando Visa...");
    }

    @Override
    public void startPayment() {
        System.out.println("Iniciando pago con Visa...");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizando pago con Visa...");
    }
}
