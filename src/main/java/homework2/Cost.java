package homework2;

import homework2.exception.InvalidAmountException;
import homework2.exception.InvalidDiscountException;

public class Cost {
    private double tuition;
    private double otherFees;

    public Cost(double tuition, double otherFees) throws InvalidAmountException {
        setTuition(tuition);
        setOtherFees(otherFees);
    }

    public double calculateTotalCost() {
        return tuition + otherFees;
    }

    public double applyScholarship(double scholarshipAmount) throws InvalidAmountException {
        if (scholarshipAmount < 0) {
            throw new InvalidAmountException("Scholarship amount must be non-negative");
        }
        double adjustedTuition = tuition - scholarshipAmount;
        return Math.max(adjustedTuition, 0);
    }

    public double applyDiscount(double discountPercentage) throws InvalidDiscountException {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new InvalidDiscountException("Discount percentage must be between 0 and 100");
        }
        return tuition * (1 - discountPercentage / 100);
    }

    public String getCostBreakdown() {
        return "Tuition: $" + tuition + "\nOther Fees: $" + otherFees;
    }

    public void setTuition(double tuition) throws InvalidAmountException {
        if (tuition < 0) {
            throw new InvalidAmountException("Tuition must be non-negative");
        }
        this.tuition = tuition;
    }

    public void setOtherFees(double otherFees) throws InvalidAmountException {
        if (otherFees < 0) {
            throw new InvalidAmountException("Other fees must be non-negative");
        }
        this.otherFees = otherFees;
    }
}
