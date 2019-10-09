import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfRoomTest {

    private ConfRoom confRoom;
    private Guest guest;

    @Before
    public void before(){
        confRoom = new ConfRoom(3, "Jura");
        guest = new Guest("George");
    }

    @Test
    public void roomHasName(){
        assertEquals("Jura", confRoom.getName());
    }

    @Test
    public void canCheckCapacity(){
        assertEquals(3, confRoom.getCapacity());
    }

    @Test
    public void canCheckGuestIn(){
        confRoom.addGuest(guest);
        assertEquals(1, confRoom.getGuestCount());
    }

    @Test
    public void cantCheckGuestInOverCapacity(){
        confRoom.addGuest(guest);
        confRoom.addGuest(guest);
        confRoom.addGuest(guest);
        confRoom.addGuest(guest);
        assertEquals(3, confRoom.getGuestCount());
    }

    @Test
    public void canCheckOutGuest(){
        confRoom.addGuest(guest);
        confRoom.addGuest(guest);
        confRoom.removeGuest(guest);
        assertEquals(0, confRoom.getGuestCount());
    }
}
