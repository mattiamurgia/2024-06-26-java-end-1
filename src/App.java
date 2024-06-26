public class App {
    public static void main(String[] args) throws Exception {

        es1();
    }

    public static void es1() {

        Bookings b = new Bookings(5);

        // Stampa tutti i posti liberi
        System.out.println(b);

        // Prenota i posti
        b.bookPlace(0);
        b.bookPlace(1);
        b.bookPlace(2);
        b.bookPlace(3);
        b.bookPlace(4);
        System.out.println(b);

        // Mostra che il posto è occupato
        b.bookPlace(0);
        b.cancelBook(0);
        b.cancelBook(4);
        System.out.println(b);

        // Prenotazione di un posto maggiore getPlaces().length
        b.bookPlace(6);

        // Verifica se ci sono posti liberi
        System.out.println();
        System.out.println("-----Free-----");
        b.findFreePlaces();
    }
}
