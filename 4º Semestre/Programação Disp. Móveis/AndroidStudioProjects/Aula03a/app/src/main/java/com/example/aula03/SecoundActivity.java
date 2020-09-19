package com.example.aula03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {

    private TextView mTextViewUsuario;
    private TextView mTextViewSenha;
    private EditText mEditTextMsg;
    private String usuario;
    private String senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        if (intent != null) {
            usuario = intent.getStringExtra("login");
            senha = intent.getStringExtra("senha");
        }


        mTextViewUsuario = findViewById(R.id.textViewUsuario);
        mTextViewSenha = findViewById(R.id.textViewSenha);
        mEditTextMsg = findViewById(R.id.textMensagem);

        mTextViewUsuario.setText(usuario);
        mTextViewSenha.setText(senha);
    }

    public void logout(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }


    public void enviarMensagem(View view){
        String  mensagem = "Usuário: " +usuario+ "Senha:" +senha+ ":" +mEditTextMsg.getText().toString();

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, mensagem);
        sendIntent.setType("text/plain");



        if (sendIntent.resolveActivity(getPackageManager()) != null){
            startActivity(sendIntent);

        }


    }


}