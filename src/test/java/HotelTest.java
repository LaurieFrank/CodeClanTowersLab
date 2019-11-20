import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before() {
        hotel = new Hotel();
        conferenceRoom = new ConferenceRoom( 200, "The Jamaica Room");
        bedroom1 = new Bedroom(112, 2,  "Double");
        bedroom2 = new Bedroom(113, 1,  "Single");
        guest2 = new Guest("Laurie");
        guest1 = new Guest("Lewis");

    }

    @Test
    public void countRoomsInHotel(){
        assertEquals(0, hotel.roomCount());
    }

    @Test
    public void countConferenceRoomsInHotel(){
        assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test
    public void addRoomToHotel(){
        hotel.addRoom(bedroom1);
        assertEquals(1, hotel.roomCount());
    }

    @Test
    public void addGuestToBedroom(){
        hotel.addRoom(bedroom1);
        hotel.checkInGuest(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
        assertEquals(1, hotel.roomCount());
    }

    @Test
    public void removeGuestFromBedroom(){
        hotel.addRoom(bedroom1);
        hotel.checkInGuest(guest1, bedroom1);
        hotel.checkOutGuest(bedroom1, guest1);
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void addConferenceRoomToHotel(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void addGuestToConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        hotel.checkInConferenceGuest(guest1, conferenceRoom);
        assertEquals(1, conferenceRoom.guestCount());
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void removeGuestFromConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        hotel.checkInConferenceGuest(guest1, conferenceRoom);
        hotel.checkOutConferenceGuest(conferenceRoom, guest1);
        assertEquals(0, conferenceRoom.guestCount());
    }
}
