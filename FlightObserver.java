package Proj3;

public class FlightObserver implements Observer{
    @Override
    public void update() {
        System.out.println("Flight booking component has been notified of a new booking");
    }
}
