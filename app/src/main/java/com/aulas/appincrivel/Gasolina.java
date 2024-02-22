package com.aulas.appincrivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Gasolina extends AppCompatActivity {

    TextInputEditText alcoolText;
    TextInputEditText gasolinaText;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasolina);
    }

    public void calcular(View view) {
        resultado = findViewById(R.id.resultado);
        alcoolText = findViewById(R.id.alcool);
        gasolinaText = findViewById(R.id.gasolina);

        double alcool = Double.parseDouble(alcoolText.getText().toString().trim());
        double gasolina = Double.parseDouble(gasolinaText.getText().toString().trim());

        double calculo = Double.valueOf(alcool / gasolina);

        resultado.setText("O melhor é ");
        if (calculo >= 0.7){
            resultado.setText(resultado.getText().toString() + "gasolina");
        } else {
            resultado.setText(resultado.getText().toString() + "alcool");
        }
    }
}