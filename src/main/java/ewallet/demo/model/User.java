package ewallet.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int nid;
    private String userName;
    private String name;
    private String email;
    private String password;
    private int phoneNum;

    // Constructors, Getters, and Setters
    public User(int nid,String userName,String name,String email,String password){
        this.nid = nid;
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(int nid,String userName,String name,String email,String password,int phoneNum){
        this.nid = nid;
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
    }

    public int getNid(){
        return nid;
    }
    public void setNid(int id){
        nid = id;
    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String newUserName){
        userName = newUserName;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String pass){
        password = pass;
    }
   
     public int getPhoneNumber(){
        return phoneNum;
    }
    public void setPhoneNumber(int num){
        phoneNum = num;
    }
}
