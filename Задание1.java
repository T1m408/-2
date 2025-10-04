abstract class Worker {
    protected String fullName;
    public Worker(String fullName) {
        this.fullName = fullName;
    }
    public abstract void doJob();
}

class Programmer extends Worker {
    public Programmer(String fullName) {
        super(fullName);
    }
    @Override
    public void doJob() {
        System.out.println(fullName + " пишет программы");
    }
}

class TeamLead extends Worker {
    public TeamLead(String fullName) {
        super(fullName);
    }
    @Override
    public void doJob() {
        System.out.println(fullName + " руководит проектом");
    }
}

public class TaskVariant {
    public static void main(String[] args) {
        Worker tim = new Programmer("Тима");
        Worker korgan = new TeamLead("Корган");
        tim.doJob();
        korgan.doJob();
    }
}
