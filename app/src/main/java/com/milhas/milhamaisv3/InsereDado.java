package com.milhas.milhamaisv3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsereDado extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button botao = (Button)findViewById(R.id.btnCadastrar);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText nome = (EditText)findViewById(R.id.txt_nome);
                EditText dt_nasc = (EditText)findViewById(R.id.txt_dtnasc);
                EditText cpf = (EditText)findViewById((R.id.txt_cpf));
                EditText email = (EditText)findViewById(R.id.txt_email);
                EditText senha = (EditText)findViewById(R.id.txt_senha);
                String nomeString = nome.getText().toString();
                String dtnascString = dt_nasc.getText().toString();
                String cpfString = cpf.getText().toString();
                String emailString = email.getText().toString();
                String senhaString = senha.getText().toString();
                String resultado;

                resultado = crud.insereDado(nomeString,dtnascString,cpfString,emailString,senhaString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }
}