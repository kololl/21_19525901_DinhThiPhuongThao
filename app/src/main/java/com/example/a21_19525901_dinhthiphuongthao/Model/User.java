package com.example.a21_19525901_dinhthiphuongthao.Model;

public class User {
    private  String Name;
    private  String Password;

    public User() {
    }

    public User(String name, String password) {
        Name = name;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
