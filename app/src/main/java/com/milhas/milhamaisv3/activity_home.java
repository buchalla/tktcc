package com.milhas.milhamaisv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button btnEfetuarTroca = (Button) findViewById(R.id.btnEfetuarTroca);

        btnEfetuarTroca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent efetuarTroca = new Intent(activity_home.this, activity_validatroca.class);
                startActivity(efetuarTroca);
            }
        });

        Button btnConsultaExtrato = (Button) findViewById(R.id.btnConsultaExtrato);

        btnEfetuarTroca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent consultaExtrato = new Intent(activity_home.this, activity_extrato.class);
                startActivity(consultaExtrato);
            }
        });
    }
}
