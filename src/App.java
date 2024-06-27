import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) throws Exception {

        // es1();
        // es2();
        // es3();
        // es4();
        es5();
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

    public static void es4() {

        try {
            Contact c1 = new Contact("Alessio", "1234567890");
            Contact c2 = new Contact("Filippo", "192454");
            Contact c3 = new Contact("Marco", "17854249");
            Contact c4 = new Contact("Luca", "54545445");

            // Lancio Errore
            // Contact c5 = new Contact("Error", "545");

            PhoneBook book = new PhoneBook();

            // Aggiunta dei contatti
            book.addContact(c1);
            book.addContact(c2);
            book.addContact(c3);
            book.addContact(c4);

            // Tutti i contatti
            System.out.println(book);

            // Rimuovi contatto
            book.removeContact(c4);

            // Tutti i contatti aggiornata (senza "Luca", "54545445")
            System.out.println(book);

            // Cerca Contatto
            System.out.println("Trovato: " + book.findContact("Alessio"));

            // Lancio Errore
            // System.out.println(book.findContact("Fischio"));

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void es5() {

        // Seggio
        ElectoralSeat seat = new ElectoralSeat();

        // Candidati
        Candidate c1 = new Candidate("Berlusconi");
        Candidate c2 = new Candidate("Meloni");

        // Elettori
        Elector e1 = new Elector("Mattia", "Murgia");
        Elector e2 = new Elector("Filippo", "Sdios");
        Elector e3 = new Elector("Alessio", "Maria");
        Elector e4 = new Elector("Giuseppe", "Pdjddk");
        Elector e5 = new Elector("Giuseppe", "Pdjddk");
        Elector e6 = new Elector("Giuseppe", "Pdjddk");

        // Aggiunta dei candidati
        seat.addCandidate(c1);
        seat.addCandidate(c2);

        // Aggiunta elettori
        seat.addVoter(e1);
        seat.addVoter(e2);
        seat.addVoter(e3);
        seat.addVoter(e4);
        seat.addVoter(e5);
        seat.addVoter(e6);

        try {

            // Votazioni c1
            seat.votingCandidates(e1, c1);
            seat.votingCandidates(e3, c1);
            seat.votingCandidates(e4, c1);
            seat.votingCandidates(e5, c1);

            // Lancio Errore
            // seat.voting(e1, c1);

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        try {

            // Votazioni c2
            seat.votingCandidates(e2, c2);
            seat.votingCandidates(e6, c2);

            // Lancio Errore
            // seat.votingCandidates(e2, c1);

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        System.out.println("Voti di " + c1.getCandidateName() + ": " + seat.getVotesForCandidate(c1));
        System.out.println("Voti di " + c2.getCandidateName() + ": " + seat.getVotesForCandidate(c2));
    }
}
