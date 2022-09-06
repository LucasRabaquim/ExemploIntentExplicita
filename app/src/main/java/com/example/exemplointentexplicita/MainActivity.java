package com.example.exemplointentexplicita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*==========================================
    * Programa de exemplo de uma intent explicita:
    * Esse app mostra como:
    * - Mudar de uma tela para outra.
    * - Mandar parâmetros para outra tela
    * - Um modo de vc não ter que criar várias telas sobre a mesma coisa: exemplo, só uma tela de autor, vc passa o "autor como parâmetro".
    *
    *  OBS:
    * - Explicação baseado o que eu entendi, pode estar errado.
    * - O código não está otimizado idealmente, a proposta do app é somente entender a utilização da IntentExplicita.
    * ==========================================*/

    // Define o "tipo" de informação que quer passar para a proxima tela, no caso uma mensagem (String).
    public final static String EXTRA_MESSAGE = ".MESSAGE";

    // Botão para mudar de activity e passar o parâmetro "Harry".
    public void autorHarry(View view){
        // Instância a tela para qual quer trocar
        Intent intent = new Intent(this, tela2.class);

        // Põe na intent esse parâmetro (obs: se não tiver passando valor não precisa colocar)
        intent.putExtra(EXTRA_MESSAGE, "Harry");

        // Inicia a próxima tela
        startActivity(intent);
    }
    public void autorRonny(View view){
        Intent intent = new Intent(this, tela2.class);
        intent.putExtra(EXTRA_MESSAGE, "Ronny");
        startActivity(intent);
    }
    /*
    * O mínimo para trocar de uma activity(tela) para outra:
    *   Intent intent = new Intent(this, <nome da outra tela java>.class);
        startActivity(intent);
    */
}