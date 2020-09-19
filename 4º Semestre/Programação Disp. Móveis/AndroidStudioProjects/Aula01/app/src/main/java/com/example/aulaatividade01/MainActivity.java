package com.example.aulaatividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextValorInicial;
    private EditText mEditTextTaxaJuros;
    private EditText mEditTextTempo;
    private TextView mTextViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextValorInicial = findViewById(R.id.editTextValorInicial);
        mEditTextTaxaJuros = findViewById(R.id.editTextTaxaJuros);
        mEditTextTempo = findViewById(R.id.editTextTempo);
        mTextViewResultado = findViewById(R.id.TextViewResultado);

    }

    public void calcularJurosSimples(View view){
        String valorDigitado = mEditTextValorInicial.getText().toString();
        String taxaDigitada = mEditTextTaxaJuros.getText().toString();
        String tempoDigitado = mEditTextTempo.getText().toString();

        //testa valores vazios
        if (!(valorDigitado.isEmpty()) &&
            !(taxaDigitada.isEmpty()) &&
            !(tempoDigitado.isEmpty())){

        //converte os valores para float
        float valorInicial = Float.parseFloat(valorDigitado);
        float taxa = Float.parseFloat(taxaDigitada);
        float tempo = Float.parseFloat(tempoDigitado);

        //realiza o calculo
        float valorJuros = valorInicial * taxa / 100 * tempo;
        float resultado = valorInicial + valorJuros;

        //Exibir o resultado final para o usuario
        mTextViewResultado.setText(String.format("R$ %.2f", resultado));




        }
    }


    public void calcularJurosCompostos(View view){
        String valorDigitado = mEditTextValorInicial.getText().toString();
        String taxaDigitada = mEditTextTaxaJuros.getText().toString();
        String tempoDigitado = mEditTextTempo.getText().toString();

        //testa valores vazios
        if (!(valorDigitado.isEmpty()) &&
                !(taxaDigitada.isEmpty()) &&
                !(tempoDigitado.isEmpty())){

            //converte os valores para float
            float valorInicial = Float.parseFloat(valorDigitado);
            float taxa = Float.parseFloat(taxaDigitada);
            float tempo = Float.parseFloat(tempoDigitado);

            //realiza o calculo
            float valorJuros = valorInicial * taxa / 100 * tempo;
            float resultado = valorInicial + valorJuros;

            //Exibir o resultado final para o usuario
            mTextViewResultado.setText(String.format("R$ %.2f", resultado));




        }
    }




}