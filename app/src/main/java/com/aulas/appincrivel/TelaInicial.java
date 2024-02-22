package com.aulas.appincrivel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity {

    Button btnGerminare;
    Button btnAndroid;
    Button btnLinearLayout;
    Button btnConversaoDolar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }

    public void exGerminare(View view) {
        Intent exGerminare = new Intent(this, Germinare.class);
        startActivity(exGerminare);
    }

    public void olaAndroid(View view) {
        Intent exAndroid = new Intent(this, OlaAndroid.class);
        startActivity(exAndroid);
    }

    public void linearLayout(View view) {
        Intent exLinearLayout = new Intent(this, LinearLayout.class);
        startActivity(exLinearLayout);
    }

    public void conversaoDolar(View view) {
        Intent exConversaoDolar = new Intent(this, DolarParaReal.class);
        startActivity(exConversaoDolar);
    }

    public void netflix(View view) {
        Intent netflix = new Intent(this, Netflix.class);
        startActivity(netflix);
    }

    public void gasolina(View view) {
        Intent gasolina = new Intent(this, Gasolina.class);
        startActivity(gasolina);
    }
}