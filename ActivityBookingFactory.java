package Proj3;

import java.util.ArrayList;

public class ActivityBookingFactory implements BookingFactory{

    ArrayList<Activity> activities;

    public ActivityBookingFactory(){
        activities=new ArrayList<>();
        activities.add(new Activity("Shopping"));
        activities.add(new Activity("Museum"));
        activities.add(new Activity("Park"));
        activities.add(new Activity("Beach"));
    }
    @Override
    public Booking createBooking(String userOption) {
        ActivityBooking activityBooking = new ActivityBooking();
        activityBooking.setActivity(userOption);
        return activityBooking;
    }

    @Override
    public ArrayList availableList() {
        return activities;
    }
}
