package Proj3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ActivityBooking implements Booking{
String activity;

public void setActivity(String activity){
    this.activity=activity;
}
    @Override
    public void create() {
        System.out.println("Confirmed");
    }
}
