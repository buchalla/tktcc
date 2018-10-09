package com.milhas.milhamaisv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_cadastro extends AppCompatActivity {

    EditText et_email;
    EditText et_senha;
    EditText et_conf_senha;
    EditText et_cpf;
    EditText et_nome;
    EditText et_dtnasc;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


            et_email=(EditText)findViewById(R.id.txt_email);
            et_senha=(EditText)findViewById(R.id.txt_senha);
            et_conf_senha=(EditText)findViewById(R.id.txt_conf_senha);
            et_cpf=(EditText)findViewById(R.id.txt_cpf);
            et_nome=(EditText)findViewById(R.id.txt_nome);
            et_dtnasc=(EditText)findViewById(R.id.txt_dtnasc);


            btn=(Button)findViewById(R.id.btnCadastrar);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

/*                    private boolean isCampoVazio(String valor){

                        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
                        return resultado;
                    }
*/

                    String validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                            "\\@" +

                            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                            "(" +

                            "\\." +

                            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                            ")+";


                    String email = et_email.getText().toString();
                    String senha = et_senha.getText().toString();
                    String conf_senha = et_conf_senha.getText().toString();


                    Matcher matcher= Pattern.compile(validemail).matcher(email);

                    if(et_cpf.getText().length() == 0 || et_nome.getText().length() == 0 || et_dtnasc.getText().length() == 0){
                        Toast.makeText(getApplicationContext(), "Há campos em branco", Toast.LENGTH_LONG).show();
                    } else {

                        if (senha == conf_senha) {


                            if (matcher.matches()) {
                                Toast.makeText(getApplicationContext(), "Ok", Toast.LENGTH_LONG).show();


                            } else {
                                Toast.makeText(getApplicationContext(), "Há campos invalidos", Toast.LENGTH_LONG).show();
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Senhas diferentes, digite novamente", Toast.LENGTH_LONG).show();
                        }
                    }

                }
            });

        }
}
