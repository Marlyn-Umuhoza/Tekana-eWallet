package ewallet.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int debitWalletNumber;
    private int creditWalletNumber;
    private date date;

    // Constructors, Getters, and Setters

    public Transaction(int debitWallet,int creditWallet, date today){
        debitWalletNumber = debitWallet;
        creditWalletNumber = creditWallet;
        date = today;
    }

    public int getDebitWalletNumber(){
        return debitWalletNumber;
    }
    public void setDebitWalletNumber(int debitWallet){
        debitWalletNumber = debitWallet;
    }

    public int getCreditWalletNumber(){
        return creditWalletNumber;
    }
    public void setCreditWalletNumber(int creditWallet){
        creditWalletNumber = creditWallet;
    }

    public date getDate(){
        return date;
    }
    public void setDate(date today){
        date = today;
    }
}
