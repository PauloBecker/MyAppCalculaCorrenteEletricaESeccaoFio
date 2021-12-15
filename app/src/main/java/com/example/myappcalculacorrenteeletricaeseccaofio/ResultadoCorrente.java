package com.example.myappcalculacorrenteeletricaeseccaofio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoCorrente extends AppCompatActivity {

    TextView resultado;
    String strNome;
    Float fltTensao,fltPotencia, fltCorrente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_corrente);

        resultado = (TextView) findViewById(R.id.textViewResultado);

        Intent intent = getIntent();
        strNome = intent.getStringExtra("nome");
        fltTensao = Float.parseFloat(intent.getStringExtra("tensao"));
        fltPotencia = Float.parseFloat(intent.getStringExtra("potencia"));
        fltCorrente = fltPotencia/fltTensao;


        String strResultado = String.format("Olá %s ! \n Corrente = %.2f Ampéres", strNome, fltCorrente);

        if (fltCorrente <= 8 ){
            strResultado = strResultado + "\n" + "Você deve usar um fio com seção 0,5 mm²";
        }else if (fltCorrente > 8 && fltCorrente <= 11){
            strResultado = strResultado + "\n" + "Você deve usar um fio com seção 0,75 mm²";
        }else if (fltCorrente > 11 && fltCorrente <= 14){
            strResultado = strResultado + "\n" + "Você deve usar um fio com seção de 1 mm²";
        }else if (fltCorrente > 14 && fltCorrente <= 17.5){
            strResultado = strResultado + "\n" + "Você deve usar um fio com seção de 1,5 mm²";
        }else if (fltCorrente > 17.5 && fltCorrente <= 24){
            strResultado = strResultado + "\n" + "Você deve usar um fio com seção de 2,5 mm²";
        }else if (fltCorrente > 24 && fltCorrente <= 32){
            strResultado = strResultado + "\n" + "Você deve usar um fio com seção de 4 mm²";
        }else if (fltCorrente > 32 && fltCorrente <= 41){
            strResultado = strResultado + "\n" + "Você deve usar um fio com seção de 6 mm²";
        }else if (fltCorrente > 41 && fltCorrente <= 57){
            strResultado = strResultado + "\n" + "Você deve usar um fio com seção de 10 mm²";
        }else if (fltCorrente > 57 && fltCorrente <= 76){
            strResultado = strResultado + "\n" + "Você deve usar um fio com seção de 10 mm²";
        }

        resultado.setText(strResultado);

    }
}