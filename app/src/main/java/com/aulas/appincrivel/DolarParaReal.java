package com.aulas.appincrivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DolarParaReal extends AppCompatActivity {

    EditText txt1;
    Button bt;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        txt1 = findViewById(R.id.dolar);
        bt = findViewById(R.id.convert);
        }

    public void converter(View view) {
        String input = txt1.getText().toString();

        float calculo = Float.parseFloat(input);
        calculo *= 5;

        ((TextView) findViewById(R.id.reais)).setText("R$: " + String.format("%.2f", calculo));
    }

    public void voltar(View view){
        finish();
    }
}
