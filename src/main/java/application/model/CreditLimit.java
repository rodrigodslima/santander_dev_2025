package application.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class CreditLimit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal limitAmount = BigDecimal.ZERO;
    private BigDecimal used = BigDecimal.ZERO;

    public CreditLimit() {}
    public CreditLimit(BigDecimal limitAmount) { this.limitAmount = limitAmount; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public BigDecimal getLimitAmount() { return limitAmount; }
    public void setLimitAmount(BigDecimal limitAmount) { this.limitAmount = limitAmount; }
    public BigDecimal getUsed() { return used; }
    public void setUsed(BigDecimal used) { this.used = used; }
}
