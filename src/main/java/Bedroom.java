import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public String checkType() {
        return this.type;
    }
}
