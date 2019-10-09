import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
//    bedroom has collection of guests so need to declare this instance variable
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(101, 2, "Single");
        guest = new Guest("George");
    }

    @Test
    public void bedroomHasNumber(){
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void checkBedroomCapacity(){
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void checkBedroomType(){
        assertEquals("Single", bedroom.getRoomType());
    }

    @Test
    public void checkGuestIn(){
        bedroom.add(guest);
        assertEquals(1, bedroom.guestListSize());
    }

    @Test
    public void cantCheckGuestInOverCapacity(){
        bedroom.add(guest);
        bedroom.add(guest);
        bedroom.add(guest);
        assertEquals(2, bedroom.guestListSize());
    }

    @Test
    public void checkOutGuest(){
        bedroom.add(guest);
        bedroom.remove(guest);
        assertEquals(0, bedroom.guestListSize());
    }
}
