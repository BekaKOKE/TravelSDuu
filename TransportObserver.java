package Proj3;

public class TransportObserver implements Observer{
    @Override
    public void update() {
        System.out.println("Transport booking component has been notified of a new booking");
    }
}
