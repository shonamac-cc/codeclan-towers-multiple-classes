import java.util.ArrayList;

public class ConfRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public ConfRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        if(this.capacity > getGuestCount()) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.clear();
    }
}
