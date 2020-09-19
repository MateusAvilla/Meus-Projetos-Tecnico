package com.example.aula03b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btEnviaDados;
    private EditText textoNome;
    private EditText textoEmail;
    private EditText dataDtnascimento;
    @Override
    protected void onResume(){
        super.onResume();
        setTitle("Tela 1");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btEnviaDados = (Button) findViewById(R.id.btEnviaDados); textoNome = (EditText) findViewById(R.id.textoNome);
        textoEmail = (EditText) findViewById(R.id.textoEmail); dataDtnascimento = (EditText) findViewById(R.id.dataDtNascimento);
    }
    public void enviar(View view){
        String nome = textoNome.getText().toString();
        String email = textoEmail.getText().toString();
        String dataNascimento = dataDtnascimento.getText().toString();
        Bundle parametros = new Bundle();
        parametros.putString("nome", nome);
        parametros.putString("email", email);
        parametros.putString("dtNasc", dataNascimento);
        Intent segundaTela = new Intent(MainActivity.this, SecoundActivity.class);        segundaTela.putExtras(parametros);
        startActivity(segundaTela);
    }
}
