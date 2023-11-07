package homework2.interfaces;

import java.math.BigDecimal;

public interface Financeable {
    void processPayment(BigDecimal amount);
    BigDecimal getBalance();
}
