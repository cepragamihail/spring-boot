package com.springbank.bankacccore.models;
import javax.persistence.Entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BankAccount {
    @Id
    private String id;
    private String accountHolderId;
    private Date creationDate;
    private AccountType accountType;
    private double balance;
}
