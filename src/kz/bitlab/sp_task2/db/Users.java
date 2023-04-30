package kz.bitlab.sp_task2.db;

public class Users {
    private Long id;
    private String email;
    private String Password;
    private String fullName;

    public Users(){}
    public Users(Long id, String email, String password, String fullName) {
        this.id = id;
        this.email = email;
        Password = password;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}


