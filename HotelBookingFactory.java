package Proj3;

import java.util.ArrayList;
import java.util.Arrays;

public class HotelBookingFactory implements BookingFactory{
    ArrayList<Hotel> availableHotels;

    public HotelBookingFactory(){
        availableHotels=new ArrayList<>();
        availableHotels.add(new Hotel("Hampton", new ArrayList<>(Arrays.asList(4.7, 5.0, 4.3))));
        availableHotels.add(new Hotel("Rixos", new ArrayList<>(Arrays.asList(3.2, 3.5, 4.0, 2.9, 3.5))));
        availableHotels.add(new Hotel("Hilton", new ArrayList<>(Arrays.asList(4.6, 4.2, 4.4))));
        availableHotels.add(new Hotel("RoyalGarden", new ArrayList<>(Arrays.asList(5.0, 2.1))));
        availableHotels.add(new Hotel("LuxuryHotel", new ArrayList<>(Arrays.asList(4.1, 1.3, 4.9, 4.8))));

    }
    @Override
    public Booking createBooking(String userOption) {
        HotelBooking hotelBooking = new HotelBooking();
        hotelBooking.setHotel(userOption);
        return hotelBooking;

    }

    @Override
    public ArrayList<Hotel> availableList() {
        return availableHotels;
    }
}
