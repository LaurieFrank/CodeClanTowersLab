import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest;

    @Before
    public void before() {
        bedroom1 = new Bedroom(112, 2,  "Double");
        bedroom2 = new Bedroom(113, 1,  "Single");
    }

    @Test
    public void getRoomNumber(){
        assertEquals(112, bedroom1.getRoomNumber());
    }

    @Test
    public void checkCapacity(){
        assertEquals(2, bedroom1.checkCapacity());
    }

    @Test
    public void countGuestsInRoom(){
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void checkRoomType(){
        assertEquals("Double", bedroom1.checkType());
    }
}
