package homework2;

import java.util.Date;

public class Admission {
    private String requirements;
    private Date deadline;
    private double applicationFee;

    public Admission(String requirements, Date deadline, double applicationFee) {
        this.requirements = requirements;
        this.deadline = deadline;
        this.applicationFee = applicationFee;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public double getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(double applicationFee) {
        this.applicationFee = applicationFee;
    }
}

