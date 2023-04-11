package patternsjava.behavioral.observer;

public class TrafficLight {

    private Status status;

    public TrafficLight(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
