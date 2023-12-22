package Proj3;

import java.util.ArrayList;

public interface BookingFactory<T> {
    Booking createBooking(String userOption);
    ArrayList<T> availableList();
}
