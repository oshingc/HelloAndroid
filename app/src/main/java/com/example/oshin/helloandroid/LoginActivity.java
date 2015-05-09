package com.example.oshin.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.oshin.helloandroid.view.viewgroup.FlyOutContainer;
import com.example.oshin.helloandroid.view.viewgroup.LoginContainer;

import static com.example.oshin.helloandroid.R.id.passInput;

public class LoginActivity extends ActionBarActivity {

    LoginContainer root;

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
            String usuarioText = ((EditText) findViewById(R.id.userInput)).getText().toString();
            String passText = ((EditText) findViewById(passInput)).getText().toString();
            if (usuarioText != null && passText != null) {
                if (usuarioText.equals("admin") && passText.equals("admin")) {
                    Intent menuView = new Intent(LoginActivity.this, SampleActivity.class);
                    startActivity(menuView);
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();

                }
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

    public void toggleMenu(View v){
        this.root.toggleMenu();
    }

}