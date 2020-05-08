package com.ems.aula_1704;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Resultado extends AppCompatActivity {
    TextView ra, nome, curso;
    Button btVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        ra = findViewById(R.id.textViewRa);
        nome = findViewById(R.id.textViewNome);
        curso = findViewById(R.id.textViewCurso);
        btVoltar = findViewById(R.id.buttonVoltar);

        ArrayList<Aluno> objAlunos = (ArrayList<Aluno>)
                getIntent().getSerializableExtra("listaAlunos");

        for (Aluno aluno : objAlunos) {
            // aluno.getRa()
            // aluno.getNome()
            // aluno.getCurso()
        }
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}