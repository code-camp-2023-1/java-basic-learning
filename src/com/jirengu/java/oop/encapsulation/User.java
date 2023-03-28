package com.jirengu.java.oop.encapsulation;

//Java Bean
public class User {

    private String userName;

    private String password;

    private boolean login;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            this.login = true;
            System.out.println("Login successfully, user name: " + userName);
        } else {
            System.out.println("Invalid credentials!!!");
        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
}
