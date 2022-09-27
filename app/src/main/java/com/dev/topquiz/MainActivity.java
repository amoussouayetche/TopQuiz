package com.dev.topquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView monText;
    private EditText monNom;
    private Button monButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monText=findViewById(R.id.textView);
        monNom=findViewById(R.id.editText);
        monButton=findViewById(R.id.button);
        //desactiver le boutton
        monButton.setEnabled(false);
        
        monNom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                monButton.setEnabled(!editable.toString().isEmpty());
            }
        });
        monButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanchgameactivity();
            }
        });

    }

    private void lanchgameactivity() {
        Intent gameActivity= new Intent(MainActivity.this,GameActivity.class);
        startActivity(gameActivity);
    }

}