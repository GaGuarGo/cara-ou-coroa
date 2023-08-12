package com.gomes.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageView = findViewById(R.id.imageResultado);
        buttonBack = findViewById(R.id.buttonBack);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Bundle dados = getIntent().getExtras();
        int num = dados.getInt("numero");


        if (num == 0) { //cara
            imageView.setImageResource(R.drawable.moeda_cara);
        } else { //coroa
            imageView.setImageResource(R.drawable.moeda_coroa);
        }
    }
}