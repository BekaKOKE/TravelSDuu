package Proj3;

public class HotelObserver implements Observer{
    @Override
    public void update() {
        System.out.println("Hotel booking component has been notified of a new booking");
    }
}
