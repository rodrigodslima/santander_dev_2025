package application.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Wallet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private BigDecimal balance = BigDecimal.ZERO;

    @ManyToOne
    private Client client;

    @OneToOne(cascade = CascadeType.ALL)
    private CreditLimit creditLimit;

    public Wallet() {}
    public Wallet(String number, Client client) { this.number = number; this.client = client; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public CreditLimit getCreditLimit() { return creditLimit; }
    public void setCreditLimit(CreditLimit creditLimit) { this.creditLimit = creditLimit; }
}
