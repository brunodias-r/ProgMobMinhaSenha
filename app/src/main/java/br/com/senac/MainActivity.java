package br.com.senac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        String phrase = ((EditText)findViewById(R.id.idPhrase)).getText().toString();
        String place = ((EditText)findViewById(R.id.idPlace)).getText().toString();
        EditText answer = (EditText) findViewById(R.id.idAnswer);

        Password passGen = new Password(phrase, place);
        answer.setText(passGen.myPass());
    }
}