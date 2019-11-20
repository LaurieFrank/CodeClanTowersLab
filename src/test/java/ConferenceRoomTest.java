import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(120, "The Jamaica Room");
        guest1 = new Guest("Lewis");
        guest2 = new Guest("Laurie");
    }

    @Test
    public void getRoomName(){
        assertEquals("The Jamaica Room", conferenceRoom.roomName());
    }

    @Test
    public void getRoomCapacity(){
        assertEquals(120, conferenceRoom.roomCapacity());
    }

    @Test
    public void countGuestsInRom(){
        assertEquals(0, conferenceRoom.guestCount());
    }
}
