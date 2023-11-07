package homework2;

import java.util.Date;

public class Admission {
    private String requirements;
    private Date deadline;
    private double applicationFee;

    public Admission(String requirements, Date deadline, double applicationFee) {
        if (requirements == null || requirements.trim().isEmpty()) {
            throw new IllegalArgumentException("Requirements cannot be empty");
        }
        if (deadline.before(new Date())) {
            throw new IllegalArgumentException("Deadline must be in the future");
        }
        if (applicationFee <= 0) {
            throw new IllegalArgumentException("Application fee must be positive");
        }
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

    public double calculateApplicationFee(boolean isEarlyApplication, boolean isInternationalStudent) {
        double fee = this.applicationFee;
        if (isEarlyApplication) {
            fee *= 0.9; // 10% discount for early applications
        }
        if (isInternationalStudent) {
            fee += 50; // Additional fee for international students
        }
        return fee;
    }

    public boolean isAdmissionOpen() {
        return new Date().before(this.deadline);
    }
}
