package com.chain.appmini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenThree extends AppCompatActivity {

    private Button screen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_three);

        screen2 = findViewById(R.id.button2);
        screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenThree.this,  MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
