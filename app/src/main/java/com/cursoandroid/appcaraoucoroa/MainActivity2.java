package com.cursoandroid.appcaraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageViewResult = findViewById(R.id.imageViewResult);

        int result = new Random().nextInt(2);

        if(result == 0)
            imageViewResult.setImageResource(R.drawable.moeda_coroa);
        else
            imageViewResult.setImageResource(R.drawable.moeda_cara);

        ImageButton imageButtonGoBack = findViewById(R.id.imageButtonGoBack);

        imageButtonGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}