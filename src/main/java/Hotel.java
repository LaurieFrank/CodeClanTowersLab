import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }


//    public void addGuestToBedroom(Guest guest, int roomNumber) {
//        // find the bedroom by roomNumber
//        this.bedrooms.getRoomNumber();
//        // addGuest to the bedroom
////        int index = this.bedrooms.indexOf(bedroomToAddGuestTo);
//        this.bedrooms.get(index).addGuest(guest);
//    }

    public int roomCount() {
        return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addRoom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void checkInGuest(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }


    public void checkOutGuest(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInConferenceGuest(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addConferenceGuest(guest);
    }


    public void checkOutConferenceGuest(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.removeConferenceGuest(guest);
    }
}