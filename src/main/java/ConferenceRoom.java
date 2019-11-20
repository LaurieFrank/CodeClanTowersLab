import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> conferenceGuests;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.conferenceGuests = new ArrayList<Guest>();
    }

    public String roomName() {
        return this.name;
    }

    public int roomCapacity() {
        return this.capacity;
    }

    public int guestCount() {
        return this.conferenceGuests.size();
    }
}
