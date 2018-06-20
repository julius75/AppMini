package com.chain.appmini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenTwo extends AppCompatActivity {

    private Button screen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);

        screen3 = findViewById(R.id.button3);
        screen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenTwo.this,  MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
