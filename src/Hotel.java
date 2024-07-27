import java.util.HashMap;
import java.util.Map;

public class Hotel {

    private Map<Room, Guest> reservations;

    public Hotel() {
        setAReservations(new HashMap<>());
    }

    public Map<Room, Guest> getReservations() {
        return reservations;
    }

    public void setAReservations(Map<Room, Guest> reservations) {
        this.reservations = reservations;
    }

    public void addReservetion(Room room, Guest guest) {
        reservations.put(room, guest);
    }

    @Override
    public String toString() {
        String res = "";
        for (Map.Entry<Room, Guest> entry : reservations.entrySet()) {
            res += "\n" + entry.getKey() + " del " + entry.getValue();
        }
        return "Prenotazioni: " + res;
    }

}
