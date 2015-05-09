package com.example.oshin.helloandroid;

/**
 * Created by oshin on 05/05/15.
 */
public class DataBaseManager {

    public static final String TABLE_NAME = "Usuario";

    public static final String CN_ID = "idUsuario";
    public static final String CN_USER = "username";
    public static final String CN_PASS = "password";
    public static final String CN_ACTIVO = "activo";

    public static final String CREATE_TABLE = "" +
            "create table "+TABLE_NAME +"( "+
            CN_ID+" integer primary key autoincrement, " +
            CN_USER +" text not null, "+
            CN_PASS + "text"+
            CN_ACTIVO+"boolean );";

}
