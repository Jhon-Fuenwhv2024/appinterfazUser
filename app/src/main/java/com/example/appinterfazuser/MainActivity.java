package com.example.appinterfazuser;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.appinterfazuser.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // A, btnRegister;
    EditText txtEmail, txtPassword;
    Button btnSignin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.SplashScreen);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPassword = findViewById(R.id.txtpassword); // ancle mi elemento que es password
        txtEmail = findViewById(R.id.txtemail); // ancla mi elemento que es email

        btnSignin = findViewById(R.id.btnSignin); // ancla mi elemento que es botón de iniciar sesión
        btnRegister = findViewById(R.id.btnRegistrer); // ancla mi elemento que es botón de registrarse



    }
}