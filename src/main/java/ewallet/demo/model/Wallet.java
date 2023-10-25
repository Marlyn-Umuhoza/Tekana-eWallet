package ewallet.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "wallets")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nid;
    private int balance;

    // Constructors, Getters, and Setters

    public Wallet(int nid,int balance){
        this.nid = nid;
        this.balance = balance;
    }

    public int getNid(){
        return nid;
    }
    public void setNid(int id){
        nid = id;
    }

    public int getBalance(){
        return balance;
    }
    public void setBalance(int bal){
        balance = bal;
    }
}
