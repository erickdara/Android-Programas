package com.erickrangel.datos_actividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Sumar extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        Bundle datos = getIntent().getExtras();

        int num1=datos.getInt("numero1");
        int num2=datos.getInt("numero2");

        int resultado=num1+num2;

        TextView valor_resultado=(TextView)findViewById(R.id.resultado_texto);

        valor_resultado.setText("El resultado es: " + resultado);


    }
}
