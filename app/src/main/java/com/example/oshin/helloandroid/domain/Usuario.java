package com.example.oshin.helloandroid.domain;


import android.net.Uri;
import android.text.TextUtils;

import com.example.oshin.helloandroid.domain.interfaces.IUsuario;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents a User in the domain layer.
 */
public class Usuario implements IUsuario {


    /*Clase*/

    public Usuario(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Usuario(int usuarioId, String username, String password, Boolean activo){
        this.usuarioId = usuarioId;
        this.username = username;
        this.password = password;
        this.activo = activo;
    }

    private int usuarioId;
    private String username;
    private String password;
    private Boolean activo;

    public int getUserId() {
        return usuarioId;
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

    @Override
    public List<Usuario> getUsuario() {
        return null;
    }
}