import java.util.HashMap;
import java.util.Map;

public class ElectoralSeat {
    private final Map<Candidate, Integer> votesCandidates = new HashMap<>();
    private final Map<Elector, Boolean> hasVoted = new HashMap<>();

    // Voting Method
    public void votingCandidates(Elector voter, Candidate candidate) throws Exception {

        if (!votesCandidates.containsKey(candidate)) {
            throw new Exception("Il candidato non esiste");
        }

        if (hasVoted.containsKey(voter) && hasVoted.get(voter)) {
            throw new Exception("Questo elettore ha già votato");
        }

        int currentVotes = votesCandidates.get(candidate);
        votesCandidates.put(candidate, currentVotes + 1);
        hasVoted.put(voter, true);
    }

    // Method for adding candidates
    public void addCandidate(Candidate candidate) {
        if (!votesCandidates.containsKey(candidate)) {
            votesCandidates.put(candidate, 0);
        }
    }

    // Method for adding voters
    public void addVoter(Elector elector) {
        if (!hasVoted.containsKey(elector)) {
            hasVoted.put(elector, false);
        }
    }

    // Method returning votes
    public int getVotesForCandidate(Candidate candidate) {
        return votesCandidates.getOrDefault(candidate, 0);
    }
}
