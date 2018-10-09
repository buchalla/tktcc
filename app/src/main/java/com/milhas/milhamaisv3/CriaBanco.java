package com.milhas.milhamaisv3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.Date;

public class CriaBanco extends SQLiteOpenHelper {
    private static final String NOME_BANCO = "milhamais.db";
    static final String TABELA = "cliente";
    private static final String ID = "_id";
    static final String NOME = "nome";
    static final String DT_NASC = "dt_nasc";
    static final String CPF = "cpf";
    static final String EMAIL = "email";
    static final String SENHA = "senha";
    private static final int VERSAO = 1;

    public CriaBanco(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE"+TABELA+"("
                + ID + " integer primary key autoincrement,"
                + NOME + " text,"
                + DT_NASC + " date,"
                + CPF + " text,"
                + EMAIL + " text,"
                + SENHA + " text"
                +")";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(String.format("DROP TABLE IF EXISTS", TABELA));
        onCreate(db);
    }
}