package me.rangar.guabirabadev.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //recupera o comportamento da classe extendida
        setContentView(R.layout.activity_lista_alunos);
    }
}
