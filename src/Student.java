import java.util.ArrayList;

public class Student {
    private String name;
    private String matr;
    private ArrayList<Integer> votes;

    public Student(String name, String matr) {
        setName(name);
        setMatr(matr);
        setVotes(new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public ArrayList<Integer> getVotes() {
        return votes;
    }

    public void setVotes(ArrayList<Integer> votes) {
        this.votes = votes;
    }

    // Method of adding votes
    public void addVotes(int vote) throws Exception {
        if (vote < 18 || vote > 30) {
            throw new Exception("Il voto deve essere compreso tra 18 e 30");
        }
        getVotes().add(vote);
    }

    // Average calculation method
    public double mediaVotes() {
        if (getVotes().isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int vote : getVotes()) {
            sum += vote;
        }
        return (double) sum / getVotes().size();
    }

    // Student details
    public String getDetails() {
        return "Studente: " + getName() + " - " + " Matricola: " + getMatr() + " - " + "Votes: " + getVotes() + " - " + "Media: " + mediaVotes();
    }

    @Override
    public String toString() {
        return getDetails();
    }

}
