package Pb4;

public class MilitaryProject extends Project {
    private String password;

    public MilitaryProject(String title, String objective, long funds, Manager manager, String password) {
        super(title, objective, funds, manager);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public double getRisk() {
        return (double) getMembers().size() / (double) (getPassword().length() * getFunds());
    }
}

