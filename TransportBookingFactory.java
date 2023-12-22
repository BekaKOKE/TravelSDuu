package Proj3;

import java.util.ArrayList;
import java.util.Arrays;

public class TransportBookingFactory implements BookingFactory{

    ArrayList<Transport> transports;

    public TransportBookingFactory(){
        transports=new ArrayList<>();
        transports.add(new Transport("Bus", new ArrayList<>(Arrays.asList(4.5, 3.9, 4.5, 5.0))));
        transports.add(new Transport("Taxi", new ArrayList<>(Arrays.asList(2.4, 3.5, 1.9))));
    }
    @Override
    public Booking createBooking(String userOption) {
        TransportBooking transportBooking = new TransportBooking();
        transportBooking.setTransport(userOption);
        return transportBooking;
    }

    @Override
    public ArrayList availableList() {
        return transports;
    }
}
