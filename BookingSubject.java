package Proj3;

import java.util.ArrayList;
import java.util.List;

public class BookingSubject {
    private static BookingSubject instance;
    private List<BookingObserver> observers;

    private BookingSubject() {
        observers = new ArrayList<>();
    }

    public static BookingSubject getInstance() {
        if (instance == null) {
            instance = new BookingSubject();
        }
        return instance;
    }

    public void registerObserver(BookingObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BookingObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BookingObserver observer : observers) {
            observer.update();
        }
    }

    public void bookingMade() {
        notifyObservers();
    }
}
