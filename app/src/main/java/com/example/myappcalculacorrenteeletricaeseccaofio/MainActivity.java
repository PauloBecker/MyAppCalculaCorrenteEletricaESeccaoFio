package com.example.myappcalculacorrenteeletricaeseccaofio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nome,tensao, potencia, corrente;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.editTextNome);
        tensao = (EditText) findViewById(R.id.editTextTensao);
        potencia = (EditText) findViewById(R.id.editTextPotencia);
        botao = (Button) findViewById(R.id.buttonCalcula);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarTelaResultado();
            }
        });
    }

    public void mostrarTelaResultado(){
        Intent intent = new Intent(this, ResultadoCorrente.class);
        intent.putExtra("nome",nome.getText().toString());
        intent.putExtra("tensao", tensao.getText().toString());
        intent.putExtra("potencia", potencia.getText().toString());
        startActivity(intent);
    }
}