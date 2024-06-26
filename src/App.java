public class App {
    public static void main(String[] args) throws Exception {

        // es1();
        // es2();
        es3();
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

    public static void es2() {

        // Crea Studente
        Student s1 = new Student("Alessio", "Dhjfkfj");

        try {
            // Aggiungi voti
            s1.addVotes(20);
            s1.addVotes(22);
            s1.addVotes(30);
            s1.addVotes(18);

            // LancioErrore
            // s1.addVotes(5);
        } catch (Exception e) {
            System.out.println("Errore nell'aggiunta del voto: " + e.getMessage());
        }

        // Stampa dettagli con i voti e media
        System.out.println(s1);
    }

    public static void es3() {

        // Crea conto corrente
        BankAccount b1 = new BankAccount(0);

        // Deposito denaro
        b1.addMoney(500);
        b1.addMoney(500);

        try {
            b1.removeMoney(100);

            // Lancio Errore
            // b1.removeMoney(10000);
        } catch (Exception e) {
            System.out.println("Errore nel prelievo: " + e.getMessage());
        }

        // Stampa saldo attuale
        System.out.println(b1);
    }
}
