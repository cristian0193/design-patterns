package patrones.behavioral.chainresposability;

public interface ApproveCreditCard {
    void setNext(ApproveCreditCard approveCreditCard);
    ApproveCreditCard getNext();
    void creditCardRequest(int quantity);
}
