package com.milhas.milhamaisv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_extrato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extrato);

        Button btnVoltarHome = (Button) findViewById(R.id.btnVoltarHome);

        btnVoltarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent voltarHome = new Intent(activity_extrato.this, activity_home.class);
                startActivity(voltarHome);
            }
        });



    }

}
