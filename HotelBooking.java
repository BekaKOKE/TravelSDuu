package Proj3;

public class HotelBooking implements Booking{
    String hotel;

    public void setHotel(String hotel){
        this.hotel=hotel;
    }

    @Override
    public void create() {
        System.out.println("Confirmed");
    }
}
