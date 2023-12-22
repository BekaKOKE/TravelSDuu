package Proj3;

import java.util.ArrayList;
import java.util.Arrays;

public class FlightBookingFactory implements BookingFactory{
ArrayList<Flight> availableFlights;

public FlightBookingFactory(){
    availableFlights = new ArrayList<>();
    availableFlights.add(new Flight("AirAstana", new ArrayList<>(Arrays.asList(4.3, 3.9))) {
        @Override
        public String getDescription() {
            return null;
        }
    });
    availableFlights.add(new Flight("FlyDubai", new ArrayList<>(Arrays.asList(4.2, 3.2, 5.0, 4.5, 3.9))) {
        @Override
        public String getDescription() {
            return null;
        }
    });
    availableFlights.add(new Flight("Qatar Airways", new ArrayList<>(Arrays.asList(3.1, 4.5))) {
        @Override
        public String getDescription() {
            return null;
        }
    });
    availableFlights.add(new Flight("Dubai Airways", new ArrayList<>(Arrays.asList(2.1, 1.5, 1.0))) {
        @Override
        public String getDescription() {
            return null;
        }
    });
    availableFlights.add(new Flight("FlyArystan", new ArrayList<>(Arrays.asList(4.3))) {
        @Override
        public String getDescription() {
            return null;
        }
    });
}
    @Override
    public Booking createBooking(String userOption) {
    FlightBooking flightBooking = new FlightBooking();
    flightBooking.setFlight(userOption);
        return flightBooking;
    }

    @Override
    public ArrayList<Flight> availableList() {
        return availableFlights;
    }


}
