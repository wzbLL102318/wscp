package com.git.wscp.domain;

/**
 * Created by ShallowDream on 2017/8/27.
 */
public class UserDomain {
    private String Id;
    private String userName;
    private String passWord;
    private String role;
    private String email;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id == null ? "" : Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? "" : userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? "" : passWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String Role) {
        this.role = role == null ? "" : role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? "" : email;
    }

    @Override
    public String toString() {
        return "Id =" + Id + "," +
                "userName =" + userName + "," +
                "passWord =" + passWord + "," +
                "role =" + role + "," +
                "email =" + email;
    }
}
