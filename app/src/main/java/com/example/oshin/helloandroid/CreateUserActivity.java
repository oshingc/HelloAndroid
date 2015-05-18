package com.example.oshin.helloandroid;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.oshin.helloandroid.domain.Usuario;
import com.example.oshin.helloandroid.domain.interfaces.IUsuario;

import static com.example.oshin.helloandroid.R.id.passInput;

/**
 * Created by oshin on 17/05/15.
 */
public class CreateUserActivity extends ActionBarActivity {

    private IUsuario iUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // this.root = (LoginContainer) this.getLayoutInflater().inflate(R.layout.activity_login, null);
        try {
            //this.setContentView(root);
            this.setContentView(R.layout.activity_create_user);



            final Button botonCrearUsuario = (Button) findViewById(R.id.cu_registrar);//Al dar clic en el boton de id login
            botonCrearUsuario.setOnClickListener(new View.OnClickListener() {//Se realiza lo siguiente
                @Override
                public void onClick(View v) {
                    String usuarioText = ((EditText) findViewById(R.id.cu_userInput)).getText().toString();
                    String passText = ((EditText) findViewById(R.id.cu_passInput)).getText().toString();
                    if (usuarioText != null && passText != null) {

                        //Creacion de usuario
                        DataBaseManager manager = new DataBaseManager(CreateUserActivity.this);
                        manager.addUsuario(usuarioText, passText);

                        Toast.makeText(getApplicationContext(), "Creación de user", Toast.LENGTH_SHORT).show();

                        /*Intent menuView = new Intent(CreateUserActivity.this, SampleActivity.class);
                        startActivity(menuView);*/

                    }else{
                        Toast.makeText(getApplicationContext(), "Ingrese todos los campos", Toast.LENGTH_SHORT).show();

                    }
                }
            });


        }catch(Exception e){
            e.printStackTrace();

        }
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sample, menu);
        return true;
    }

}
