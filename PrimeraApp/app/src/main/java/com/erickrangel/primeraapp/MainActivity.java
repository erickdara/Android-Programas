package com.erickrangel.primeraapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textoPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       /* TextView miTexto=new TextView(this);

        miTexto.setText("Hola alumnos!! Mi segundo Hola Mundo");

        setContentView(miTexto); //Vista que visualizara la actividad */
    }

    public void escribeTexto(){
        textoPantalla.setText("");
    }

}