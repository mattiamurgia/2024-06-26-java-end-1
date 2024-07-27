import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) throws Exception {

        // es1();
        // es2();
        // es3();
        // es4();
        // es5();
        es6();
    }

    public static void es1() {

        Bookings b = new Bookings(5);

        // Print all vacancies
        System.out.println(b);

        // Reserve places
        b.bookPlace(0);
        b.bookPlace(1);
        b.bookPlace(2);
        b.bookPlace(3);
        b.bookPlace(4);
        System.out.println(b);

        // Show place is occupied
        b.bookPlace(0);
        b.cancelBook(0);
        b.cancelBook(4);
        System.out.println(b);

        // Reservation of a greater place getPlaces().length
        b.bookPlace(6);

        // Check if there are vacancies
        System.out.println();
        System.out.println("-----Free-----");
        b.findFreePlaces();
    }

    public static void es2() {

        // Create Student
        Student s1 = new Student("Alessio", "Dhjfkfj");

        try {
            // Add votes
            s1.addVotes(20);
            s1.addVotes(22);
            s1.addVotes(30);
            s1.addVotes(18);

            // Launch exception
            // s1.addVotes(5);
        } catch (Exception e) {
            System.out.println("Errore nell'aggiunta del voto: " + e.getMessage());
        }

        // Print details with grades and average
        System.out.println(s1);
    }

    public static void es3() {

        // Create current account
        BankAccount b1 = new BankAccount(0);

        // Money deposit
        b1.addMoney(500);
        b1.addMoney(500);

        try {
            b1.removeMoney(100);

            // Launch exception
            // b1.removeMoney(10000);
        } catch (Exception e) {
            System.out.println("Errore nel prelievo: " + e.getMessage());
        }

        // Print current balance
        System.out.println(b1);
    }

    public static void es4() {

        try {
            Contact c1 = new Contact("Alessio", "1234567890");
            Contact c2 = new Contact("Filippo", "192454");
            Contact c3 = new Contact("Marco", "17854249");
            Contact c4 = new Contact("Luca", "54545445");

            // Launch exception
            // Contact c5 = new Contact("Error", "545");

            PhoneBook book = new PhoneBook();

            // Adding Contacts
            book.addContact(c1);
            book.addContact(c2);
            book.addContact(c3);
            book.addContact(c4);

            // All contacts
            System.out.println(book);

            // Remove contact
            book.removeContact(c4);

            // All contacts updated (without 'Luca', '54545445') System.out.println(book);

            // Search Contact
            System.out.println("Trovato: " + book.findContact("Alessio"));

            // Launch exception
            // System.out.println(book.findContact("Fischio"));

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void es5() {

        // Seat
        ElectoralSeat seat = new ElectoralSeat();

        // Candidates
        Candidate c1 = new Candidate("Berlusconi");
        Candidate c2 = new Candidate("Meloni");

        // Voters
        Elector e1 = new Elector("Mattia", "Murgia");
        Elector e2 = new Elector("Filippo", "Sdios");
        Elector e3 = new Elector("Alessio", "Maria");
        Elector e4 = new Elector("Giuseppe", "Pdjddk");
        Elector e5 = new Elector("Giuseppe", "Pdjddk");
        Elector e6 = new Elector("Giuseppe", "Pdjddk");

        // Addition of candidates
        seat.addCandidate(c1);
        seat.addCandidate(c2);

        // Addition of voters
        seat.addVoter(e1);
        seat.addVoter(e2);
        seat.addVoter(e3);
        seat.addVoter(e4);
        seat.addVoter(e5);
        seat.addVoter(e6);

        try {

            // Voting c1
            seat.votingCandidates(e1, c1);
            seat.votingCandidates(e3, c1);
            seat.votingCandidates(e4, c1);
            seat.votingCandidates(e5, c1);

            // Launch exception
            // seat.voting(e1, c1);

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        try {

            // Vote c2
            seat.votingCandidates(e2, c2);
            seat.votingCandidates(e6, c2);

            // Launch exception
            // seat.votingCandidates(e2, c1);

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        System.out.println("Voti di " + c1.getCandidateName() + ": " + seat.getVotesForCandidate(c1));
        System.out.println("Voti di " + c2.getCandidateName() + ": " + seat.getVotesForCandidate(c2));
    }

    public static void es6() {

        // Room creation
        Room r1 = new Room(150, "Suite");
        Room r2 = new Room(222, "Family");
        Room r3 = new Room(100, "Classica");

        // Host creation
        Guest g1 = new Guest("Mattia", "Murgia", "matt@gmail.com");
        Guest g2 = new Guest("Marco", "Bhfkkf", "tttt@gmail.com");
        Guest g3 = new Guest("Filippo", "Sjfkffk", "aaaa@gmail.com");

        // Create reservation
        // ReservationRoom res = new ReservationRoom(g, r);

        // Create Hotels
        Hotel h = new Hotel();

        h.addReservetion(r1, g1);
        h.addReservetion(r2, g2);
        h.addReservetion(r3, g3);

        System.out.println(h);
    }
}
