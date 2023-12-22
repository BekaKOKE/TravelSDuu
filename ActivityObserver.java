package Proj3;

public class ActivityObserver implements Observer{

    @Override
    public void update() {
        System.out.println("Activity booking component has been notified of a new booking");

    }
}
