import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
//    as the Bedroom has a collection of guests we need to declare an instance variable
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
//        so the Bedroom class can use the ArrayList we need to define it in the Constructor
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getRoomCapacity() {
        return this.capacity;
    }

    public String getRoomType() {
        return this.type;
    }

    public int guestListSize() {
        return this.guests.size();
    }

    public void add(Guest guest) {
        if (this.capacity > guestListSize()) {
            this.guests.add(guest);
        }
    }

    public void remove(Guest guest) {
        this.guests.clear();
    }


}
