import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;
    private Guest guest2;


    @Before
    public void before(){
        guest1 = new Guest("Lewis");
        guest2 = new Guest("Laurie");
    }

    @Test
    public void getGuestName(){
        assertEquals("Lewis", guest1.getName());
    }
}
