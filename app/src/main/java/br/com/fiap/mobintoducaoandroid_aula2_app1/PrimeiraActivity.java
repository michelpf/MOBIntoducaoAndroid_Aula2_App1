package br.com.fiap.mobintoducaoandroid_aula2_app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PrimeiraActivity extends AppCompatActivity {

    private TextView txtNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // chama onCreate da super classe
        super.onCreate(savedInstanceState);
        // cria a interface de usuário com base no arquivo xml criado em layout
        setContentView(R.layout.activity_primeira);

        txtNumero = (TextView) findViewById(R.id.txtNumero);
        txtNumero.setText(R.string.txtZero);

    }

    public void mais(View v) {

        //obtém o texto atual do txtNumero
        Integer val = Integer.parseInt(txtNumero.getText().toString());
        val++;
        // define dinamicamente o valor de txtNumero com o valor atualizado
        txtNumero.setText(String.valueOf(val));
    }

    public void menos(View v) {

        Integer val = Integer.parseInt(txtNumero.getText().toString());
        val--;
        txtNumero.setText(String.valueOf(val));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_primeira, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this,"Menu de Configurações Acionado!",Toast.LENGTH_LONG).show();
        }
        if (id == R.id.action_menuOp1){
            Toast.makeText(this,"Menu de Configurações 1 Acionado!",Toast.LENGTH_LONG).show();
        }
        if (id == R.id.action_menuOp2){
            Toast.makeText(this,"Menu de Configurações 2 Acionado!",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
