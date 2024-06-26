
import java.util.Arrays;

public class Bookings {

    private boolean[] places;

    public Bookings(int nPlaces) {
        setPlaces(new boolean[nPlaces]);
    }

    public boolean[] getPlaces() {
        return places;
    }

    public void setPlaces(boolean[] places) {
        this.places = places;
    }

    // Add Reservation Method
    public void bookPlace(int iPlace) {
        if (iPlace < 0 || iPlace >= getPlaces().length) {
            System.out.println("iPlace non valido");
        } else if (getPlaces()[iPlace]) {
            System.out.println("Il posto " + (iPlace + 1) + " è già occupato");
        } else {
            getPlaces()[iPlace] = true;
            System.out.println("Prenotato il posto " + (iPlace + 1));
        }
    }

    // Booking Cancellation Method
    public void cancelBook(int iPlace) {
        if (iPlace < 0 || iPlace >= getPlaces().length) {
            System.out.println("iPlace non valido");
        } else if (!getPlaces()[iPlace]) {
            System.out.println("Il posto " + (iPlace + 1) + " non è occupato");
        } else {
            getPlaces()[iPlace] = false;
            System.out.println("Annullata la prenotazione del posto " + (iPlace + 1));
        }
    }

    // Method Checking Vacancies
    public void findFreePlaces() {
        boolean freePlace = false;
        System.out.print("I posti liberi sono: ");
        for (int i = 0; i < getPlaces().length; i++) {
            if (!getPlaces()[i]) {
                System.out.print((i + 1) + " ");
                freePlace = true;
            }
        }
        if (!freePlace) {
            System.out.println("Non ci sono posti liberi");
        }
    }

    @Override
    public String toString() {
        return "Bookings: " + Arrays.toString(getPlaces()) + "\n";
    }

}
