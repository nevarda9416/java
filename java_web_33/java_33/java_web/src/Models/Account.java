package Models;

import java.util.Date;

public class Account {
    private int id;
    private String username;
    private String password;
    private String telephone;
    private int age;

    private Date createdDate;

    public Account() {
    }

    public Account(int id, String username, String password, String telephone, int age, Date createdDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.age = age;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return id +
                "," + username +
                "," + password +
                "," + telephone +
                "," + age +
                "," + createdDate;
    }
}
