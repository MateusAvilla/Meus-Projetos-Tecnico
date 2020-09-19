package com.example.aula03b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {

    public TextView textoNome;
    public TextView textoEmail;
    public TextView textoDtNascimento;
    @Override
    protected void onResume(){
        super.onResume();
        setTitle("Tela 2");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        Intent recebeDados = getIntent();
        if (recebeDados != null) {
            Bundle parametros = recebeDados.getExtras();
            if (parametros != null) {
                String nome = parametros.getString("nome");
                String email = parametros.getString("email");
                String dtNasc = parametros.getString("dtNasc");
                textoNome = (TextView) findViewById(R.id.textoNome);
                textoEmail = (TextView) findViewById(R.id.textoEmail); textoDtNascimento = (TextView) findViewById(R.id.dataDtNascimento);
                textoNome.setText("Nome: " + nome.toString());
                textoEmail.setText("Email: " + email.toString());
                textoDtNascimento.setText("Data Nascimento: " + dtNasc);
            }
        }
    }
    public void principal(View view) {
        Intent principal = new Intent(this, MainActivity.class);
        startActivity(principal);
    }

}