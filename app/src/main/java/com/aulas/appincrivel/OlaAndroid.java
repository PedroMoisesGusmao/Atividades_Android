package com.aulas.appincrivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OlaAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void mensagem(View view) {
        Toast.makeText(this, "Ola", Toast.LENGTH_SHORT).show();
    }

    public void voltar(View view) {finish();}
}