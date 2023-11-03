package homework2;

public class Cost {
    private double tuition;
    private double otherFees;

    public Cost(double tuition, double otherFees) {
        setTuition(tuition);
        setOtherFees(otherFees);
    }

    public double calculateTotalCost() {
        return tuition + otherFees;
    }

    public double applyScholarship(double scholarshipAmount) {
        double adjustedTuition = tuition - scholarshipAmount;
        return adjustedTuition < 0 ? 0 : adjustedTuition;
    }

    public double applyDiscount(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100");
        }
        return tuition * (1 - discountPercentage / 100);
    }

    public String getCostBreakdown() {
        return "Tuition: $" + tuition + "\nOther Fees: $" + otherFees;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        if (tuition < 0) {
            throw new IllegalArgumentException("Tuition must be non-negative");
        }
        this.tuition = tuition;
    }

    public double getOtherFees() {
        return otherFees;
    }

    public void setOtherFees(double otherFees) {
        if (otherFees < 0) {
            throw new IllegalArgumentException("Other fees must be non-negative");
        }
        this.otherFees = otherFees;
    }
}
