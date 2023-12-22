package Proj3;

public class TransportBooking implements Booking{
String transport;

public void setTransport(String transport){
    this.transport=transport;
}
    @Override
    public void create() {
        System.out.println("Confirmed");
    }
}
