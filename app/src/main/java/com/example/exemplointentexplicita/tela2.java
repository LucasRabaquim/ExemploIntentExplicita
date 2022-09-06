package com.example.exemplointentexplicita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.Objects;

public class tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        // Pega o id da imagem para poder programa em cima dela.
        ImageView imagem = findViewById(R.id.imgEscolha);

        // Pega o id da imagem para poder programa em cima dele.
        TextView texto = findViewById(R.id.txtEscolha);

        // Recupera os dados passados na tela anterior
        // Obs: se não quiser as informações da tela anterior, não precisa usar
        Intent dadosIntent = getIntent();

        // Pega a mensagem que estava na intent.
        String escolha = dadosIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // O Java usa equals() ao invés de == para comparar String :/
        if(escolha.equals("Harry")){
            // Define o texto com o nome do ator
            texto.setText("Daniel Radcliffe");

            // Define a foto do ator
            // drawable porque as todas imagens tem que estar na pasta drawables.
            // daniel é o nome do arquivo (ignora a extensão) e é OBRIGATÓRIAMENTE EM MINÚSCULO !!!
            imagem.setImageResource(R.drawable.daniel);
        }
        if(escolha.equals("Ronny")){
            texto.setText("Rupert Grint");
            imagem.setImageResource(R.drawable.rupert);
        }
    }
    public void voltar(View view){
        // Voltando para a tela anterior
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}