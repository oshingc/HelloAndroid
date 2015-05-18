package com.example.oshin.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.example.oshin.helloandroid.domain.Usuario;
import com.example.oshin.helloandroid.view.viewgroup.FlyOutContainer;
import com.example.oshin.helloandroid.view.viewgroup.LoginContainer;
import com.example.oshin.helloandroid.CreateUserActivity;

import static com.example.oshin.helloandroid.R.id.passInput;

public class LoginActivity extends ActionBarActivity {

    LoginContainer root;

    private DataBaseManager manager;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // this.root = (LoginContainer) this.getLayoutInflater().inflate(R.layout.activity_login, null);
try {
    //this.setContentView(root);
    this.setContentView(R.layout.activity_login);



    final Button botonLogin = (Button) findViewById(R.id.login);//Al dar clic en el boton de id login
    botonLogin.setOnClickListener(new View.OnClickListener() {//Se realiza lo siguiente
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "boton login", Toast.LENGTH_SHORT).show();

            String usuarioText = ((EditText) findViewById(R.id.userInput)).getText().toString();
            String passText = ((EditText) findViewById(R.id.passInput)).getText().toString();
            if (usuarioText != null && passText != null) {
                Toast.makeText(getApplicationContext(), "DIferente a null", Toast.LENGTH_SHORT).show();


                Usuario user = manager.getUsuario(usuarioText, passText);
                Toast.makeText(getApplicationContext(), user.getUsername()+" --", Toast.LENGTH_SHORT).show();


                if(user!=null){
                    Intent menuView = new Intent(LoginActivity.this, SampleActivity.class);
                    startActivity(menuView);

                }else{
                    Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();

                }

               /* if (usuarioText.equals("admin") && passText.equals("admin")) {
                    Intent menuView = new Intent(LoginActivity.this, SampleActivity.class);
                    startActivity(menuView);
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();

                }*/
            }
        }
    });


    final Button botonRedirectCrearUsuario = (Button) findViewById(R.id.crear);//Al dar clic en el boton de id login
    botonRedirectCrearUsuario.setOnClickListener(new View.OnClickListener() {//Se realiza lo siguiente
        @Override
        public void onClick(View v) {

                    Intent createUserActivity = new Intent(LoginActivity.this, CreateUserActivity.class);
                    startActivity(createUserActivity);

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

    /*public void toggleMenu(View v){
        this.root.toggleMenu();
    }*/

}