package Pb4;

public class OpenSourceProject extends Project implements Risky {
    private static Manager manager;
	private String mailingList;

    public OpenSourceProject(String title, String objective, long funds, String mailingList) {
        super(title, objective, funds, manager);
        this.mailingList = mailingList;
    }

    public String getMailingList() {
        return mailingList;
    }

    public void setMailingList(String mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public double getRisk() {
        return getMembers().size() / getFunds();
    }
}

