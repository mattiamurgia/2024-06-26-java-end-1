public class ReservationRoom {

    private Guest guest;
    private Room room;

    public ReservationRoom(Guest guest, Room room) {
        setGuest(guest);
        setRoom(room);
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Prenotazione del " + getGuest() + " - " + getRoom();
    }

}
