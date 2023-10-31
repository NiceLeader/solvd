package homework2;

public class Cost {
    private double tuition;
    private double otherFees;

    public Cost(double tuition, double otherFees) {
        this.tuition = tuition;
        this.otherFees = otherFees;
    }

    public double calculateTotalCost() {
        return tuition + otherFees;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public double getOtherFees() {
        return otherFees;
    }

    public void setOtherFees(double otherFees) {
        this.otherFees = otherFees;
    }
}
