package com.cursoandroid.appcaraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Notice that MainActivity2 uses the context of this activity
        // In this case, you could've also used getApplicationContext().
        ImageButton imageButtonPlay = new ImageButton(this);
        imageButtonPlay = findViewById(R.id.imageButtonPlay);

        imageButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an activity
                // Here, you cannot use "this" as the context, since the intent creates
                // a separate Activity and thus a different context
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class );

                // Start the activity
                startActivity(intent);
            }
        });

    }
}