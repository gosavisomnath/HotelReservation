package com.bridgelabz;

import java.util.List;

public class Reservation implements ReservationImpl {
    private List<Hotel> hotelList;



    @Override
    public void add() {
        Hotel hotel=new Hotel();
        hotelList.add(hotel);


    }
}
