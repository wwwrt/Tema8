package Pb4;

	public class CommercialProject extends Project {
	    private long marketingFunds;
	    private int numTeams;

	    public CommercialProject(String title, String objective, long funds, Manager manager, long marketingFunds, int numTeams) {
	        super(title, objective, funds, manager);
	        this.marketingFunds = marketingFunds;
	        this.numTeams = numTeams;
	    }

	    public long getMarketingFunds() {
	        return marketingFunds;
	    }

	    public int getNumTeams() {
	        return numTeams;
	    }

	    @Override
	    public double getRisk() {
	        return (double) (getNumTeams() * 3) / (double) (getMembers().size() * getFunds()) - getMarketingFunds();
	    }
	}

