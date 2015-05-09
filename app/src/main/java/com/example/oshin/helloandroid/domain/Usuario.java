package com.example.oshin.helloandroid.domain;


/**
 * Class that represents a User in the domain layer.
 */
public class Usuario {

    private final int userId;

    public Usuario(int userId) {
        this.userId = userId;
    }

    private String username;
    private String password;
    private Boolean activo;

    public int getUserId() {
        return userId;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("***** User Details *****\n");
        stringBuilder.append("id=" + this.getUserId() + "\n");
        stringBuilder.append("username=" + this.getUsername() + "\n");
        stringBuilder.append("pass=" + this.getPassword() + "\n");
        stringBuilder.append("activo=" + this.getActivo() + "\n");
        stringBuilder.append("*******************************");

        return stringBuilder.toString();
    }
}