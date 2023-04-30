package Pb4;

import java.util.ArrayList;
import java.util.List;

public abstract class Project implements Risky {
    private String title;
    private String objective;
    private long funds;
    protected Manager manager;
    private List<Member> members;

    public Project(String title, String objective, long funds, Manager manager) {
        this.title = title;
        this.objective = objective;
        this.funds = funds;
        this.manager = manager;
        this.members = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getObjective() {
        return objective;
    }

    public long getFunds() {
        return funds;
    }

    public class Manager {
        public Manager(String name, int age) {
        }
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Member> getMembers() {
        return members;
    }
}
