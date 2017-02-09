package massim.scenario.city.data;

import massim.scenario.city.data.facilities.Storage;

/**
 * An auctioned job in the City scenario.
 */
public class AuctionJob extends Job{

    private String assignedTeam;

    public AuctionJob(int reward, String source, Storage storage, int begin, int end) {
        super(reward, source, storage, begin, end);
    }

    public void assign(String team){
        assignedTeam = team;
    }

    public boolean isAssigned() {
        return assignedTeam != null;
    }

    public String getAuctionWinner() {
        return assignedTeam;
    }
}