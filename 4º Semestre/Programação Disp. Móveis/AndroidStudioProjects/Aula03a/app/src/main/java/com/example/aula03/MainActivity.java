package com.example.aula03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private EditText mEditTextUsuario;
    private EditText mEditTextSenha;
    private TextView mMensagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextUsuario = findViewById(R.id.editTextUsuario);
        mEditTextSenha = findViewById(R.id.editTextSenha);
        mMensagem = findViewById(R.id.editTextMsg);

    }


    public void proximaTela(View view) {

        if (mEditTextUsuario.getText().toString().equals("aluno")
        && (mEditTextSenha.getText().toString().equals("123"))) {

        Intent intent = new Intent(this, SecoundActivity.class);
        intent.putExtra("login", mEditTextUsuario.getText().toString());
        intent.putExtra("senha", mEditTextSenha.getText().toString());
        startActivity(intent);
        }

        else {
            mMensagem.setText("Usuário ou Senha inválidos. Tente novamente.");


        }





    }


}