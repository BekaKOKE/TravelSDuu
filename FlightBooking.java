package Proj3;

import java.util.ArrayList;

public class FlightBooking implements Booking{

    String flight;

public void setFlight(String flight){
    this.flight=flight;
}
    @Override
    public void create() {
        System.out.println("Confirmed");
    }
}
