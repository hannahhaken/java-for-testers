package com.javafortesters.domainentities;


public class User {

    private String username;
    private String password;
    // made private so we have created methods which allow other classes to access the values of these variables.
    // made private to stop other classes amending the values of these fields at any point.

    public User(){
        this("username", "password");

        //username = "username";
        //password = "password";
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
